:: Interstar Corp.
:: this is a separate product included in butter OS.
@echo off
title CALCULATOR
goto calc
:calc
cls
ECHO Calculator Version 1.6
echo.
ECHO * = Multiply
ECHO + = Add
ECHO - = Minus
ECHO / = Divide
echo % = Modulus
SET /p UDefine= 
SET /a UDefine=%UDefine%
ECHO =
ECHO %UDefine%
ECHO.
pause
goto calc
