@echo off
setlocal enabledelayedexpansion

REM Cartella passata come parametro
set "TARGET_DIR=%~1"

REM Controllo parametro
if "%TARGET_DIR%"=="" (
    echo Usage:
    echo dump-bytecode.cmd "C:\cartella"
    exit /b 1
)

REM Cicla tutti i .class ricorsivamente
for /r "%TARGET_DIR%" %%F in (*.class) do (

    REM Percorso completo file
    set "CLASS_FILE=%%F"

    REM Nome file senza estensione
    set "CLASS_NAME=%%~nF"

    REM File output
    set "OUTPUT_FILE=%%~dpF%%~nF.bytecode.txt"

    echo Processing %%F ...

    javap -c -p -v "%%F" > "!OUTPUT_FILE!"
)

echo Done.
pause