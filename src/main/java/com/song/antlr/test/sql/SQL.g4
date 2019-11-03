grammar SQL;

Statement
    : SelectStatement
    | UnionStatement
    | InsertStatement
    | UpdateStatement
    | DeleteStatement;

SelectStatement: SelectClause FromClause? WhereClause? (GroupByClause Having?)? OrderByClause?;

SelectClause: Columns+;
Column: '*'? | Identifier '.*'
             | Expressions Alias?

//MathOperator为数学运算符，例如+, -, *, /, %
Expressions
    : Expression (MathOperator Expression)*;

//Identifier为字段/属性名，Constant为常量，包括系统变量例如@@identity之类以及字符串等
//Case .. When 语句当作Function处理

Expression
    : Identifier
    | Constant
    | UserVariable
    | Function
    | SelectStatement
    | UnionStatement
    ;


//Where子句采用较标准的运算语法树形式，类EBNF描述
WhereClause
    : Condition;
Condition
    : SubCondition ((AND ^ | OR ^) SubCondition)*

SubCondition
    : '(' Condition ')'
    | Predicate
    ;

Predicate: Expressions (
        ComparisonOperator Expressions //ComparisonOperator为>, <=, !>, Like等比较运算符
        | IS NOT? NULL
        | IN '(' Expressions (',' Expressions)* ')'
        | BETWEEN Expressions AND Expressions
        | IN '(' (SelectStatement | UnionStatement) ')'
    ) |
    EXISTS '(' (SelectStatement | UnionStatement) ')';