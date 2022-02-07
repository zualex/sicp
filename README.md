# СИКП

## Глава 1. Построение абстракций с помощью процедур
 - [Упражнение 1.1 (Что выведет интерпретатор)](doc/exercise/1/1.1.md)
 - [Упражнение 1.2 (Перевод выражения в код)](doc/exercise/1/1.2.md)
 - [Упражнение 1.3 (Сумма квадратов двух больших из них)](doc/exercise/1/1.3.md)
 - [Упражнение 1.4 (Описать работу a-plus-abs-b)](doc/exercise/1/1.4.md)
 - [Упражнение 1.5 (Тест порядка вычисления)](doc/exercise/1/1.5.md)
 - [Упражнение 1.6 (Особая форма if)](doc/exercise/1/1.6.md)
 - [Упражнение 1.7 (Вычисление квадратного корня)](doc/exercise/1/1.7.md)
 - [Упражнение 1.8 (Метод Ньютона для кубических корней)](doc/exercise/1/1.8.md)
 - [Упражнение 1.9 (Процесс итеративный или рекурсивный)](doc/exercise/1/1.9.md)
 - [Упражнение 1.10 (Функцией Аккермана)](doc/exercise/1/1.10.md)
 - [Упражнение 1.11 (Итеративный и рекурсивный код)](doc/exercise/1/1.11.md)
 - [Упражнение 1.12 (Треугольником Паскаля)](doc/exercise/1/1.12.md)
 - [Упражнение 1.13 (Числа Фибоначчи и индукция)](doc/exercise/1/1.13.md)
 - [Упражнение 1.14 (Нарисовать дерево для count-change)](doc/exercise/1/1.14.md)
 - [Упражнение 1.15 (Синус угла)](doc/exercise/1/1.15.md)

### Код

docker build -t sicp .
docker run -it --rm --name my-sicp sicp

#### Repl
https://calva.io/connect/
ctrl+alt+c ctrl+alt+j

##### Установка
1. Clojure https://github.com/clojure/tools.deps.alpha/wiki/clj-on-Windows
2. Leiningen https://leiningen.org/
3. Calva https://calva.io/

##### Если ошибка:
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