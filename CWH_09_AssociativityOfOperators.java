public class CWH_09_AssociativityOfOperators {
    
}
/*
PRECEDENCE ==>
    Precedence means priority of operators in an expression.
    It decides which operator is evaluated first.
    Higher precedence operators execute before lower ones.
    Parentheses () have the highest precedence.
        PRECEDENCE TABLE (HIGHEST -> LOWEST)
            Postfix operators
            expr++
            expr--

            Unary operators
            ++expr
            --expr
            + -
            ! (logical NOT)
            ~ (bitwise NOT)
            Type casting (type)

            Multiplicative operators
            *
            /
            %

            Additive operators
            +
            -

            Shift operators
            <<
            >>
            >>>

            Relational operators
            <
            >
            <=
            >=
            instanceof

            Equality operators
            ==
            !=

            Bitwise AND
            &

            Bitwise XOR
            ^

            Bitwise OR
            |

            Logical AND
            &&

            Logical OR
            ||

            Ternary operator
            ? :

            Assignment operators (Lowest precedence)
            =
            += -= *= /= %
            &= ^= |=
            <<= >>= >>>=

ASSOCIATIVITY ==> 
    Associativity decides the direction of evaluation
    When operators have the same precedence, associativity tells which one runs first.
    It answers the question:
        👉 Left to Right or Right to Left?
    Most arithmetic operators follow Left to Right associativity
    Associativity only matters when:
        Operators have the same precedence level
    If operators have different precedence:
        Precedence decides first
        Associativity does not matter

Left → Right Associativity

    These operators evaluate from left to right:

    Postfix operators
    expr++
    expr--

    Multiplicative operators
    *
    /
    %

    Additive operators
    +
    -

    Shift operators
    <<
    >>
    >>>

    Relational operators
    <
    >
    <=
    >=
    instanceof

    Equality operators
    ==
    !=

    Bitwise operators
    &
    ^
    |

    Logical operators
    &&
    ||


Right → Left Associativity

    These operators evaluate from right to left:

    Unary operators
    ++
    --
    +
    -
    !
    ~
    (type casting)

    Ternary operator
    ? :

    Assignment operators
    =
    +=
    -=
    *=
    /=
    %=
    &=
    ^=
    |=
    <<=
    >>=
    >>>=
 */