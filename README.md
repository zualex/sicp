docker build -t sicp .
docker run -it --rm --name my-sicp sicp

## Repl
https://calva.io/connect/
ctrl+alt+c ctrl+alt+j

## Устанавка
1. Clojure https://github.com/clojure/tools.deps.alpha/wiki/clj-on-Windows
2. Leiningen https://leiningen.org/
3. Calva https://calva.io/

## Calve
CTRL + SHIFT + P
Выбрать: Fire up the ”Getting Started” REPL
Далее исполнение команды ALT + ENTER

## Если ошибка:
```
PS C:\WINDOWS\system32> clj -h
clj : The 'clj' command was found in the module 'ClojureTools', but the module could not be loaded. For more
information, run 'Import-Module ClojureTools'.
At line:1 char:1
+ clj -h
+ ~~~
    + CategoryInfo          : ObjectNotFound: (clj:String) [], ParentContainsErrorRecordException
    + FullyQualifiedErrorId : CouldNotAutoloadMatchingModule

PS C:\WINDOWS\system32> Import-Module ClojureTools
Import-Module : File C:\Users\zualex\Documents\WindowsPowerShell\Modules\ClojureTools\ClojureTools.psm1 cannot be
loaded because running scripts is disabled on this system. For more information, see about_Execution_Policies at
https:/go.microsoft.com/fwlink/?LinkID=135170.
At line:1 char:1
+ Import-Module ClojureTools
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : SecurityError: (:) [Import-Module], PSSecurityException
    + FullyQualifiedErrorId : UnauthorizedAccess,Microsoft.PowerShell.Commands.ImportModuleCommand
```

То выполнить:
```
Set-ExecutionPolicy -ExecutionPolicy RemoteSigned
```