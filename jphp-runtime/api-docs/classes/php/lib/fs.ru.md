# fs

- **класс** `fs` (`php\lib\fs`)
- **пакет** `std`
- **исходники** [`php/lib/fs.php`](./src/main/resources/JPHP-INF/sdk/php/lib/fs.php)

**Описание**

File System class.

Class fs

---

#### Статичные Методы

- `fs ::`[`separator()`](#method-separator) - _Возвращает символ разделитель для имен файлов на текущей ОС._
- `fs ::`[`pathSeparator()`](#method-pathseparator) - _Возвращает символ разделитель для файловых-путей на текущей ОС._
- `fs ::`[`valid()`](#method-valid) - _Проверяет имя файла на корректность._
- `fs ::`[`abs()`](#method-abs) - _Возвращает абсолютный путь._
- `fs ::`[`name()`](#method-name) - _Возвращает имя файла пути._
- `fs ::`[`nameNoExt()`](#method-namenoext) - _Возвращает имя файла пути отсекая расшерение с точкой._
- `fs ::`[`pathNoExt()`](#method-pathnoext) - _Возвращает путь отсекая расшерение с точкой._
- `fs ::`[`relativize()`](#method-relativize)
- `fs ::`[`ext()`](#method-ext) - _Возвращает расширение пути или файла без точки._
- `fs ::`[`hasExt()`](#method-hasext) - _Check that $path has an extension from the extension set._
- `fs ::`[`parent()`](#method-parent) - _Возвращает родительскую директорию._
- `fs ::`[`ensureParent()`](#method-ensureparent) - _Проверяет - есть ли родительские директории для пути и пытается их создать если их нет._
- `fs ::`[`normalize()`](#method-normalize) - _Приводит файловый путь к родному виду текущей ОС._
- `fs ::`[`exists()`](#method-exists) - _Проверяет, существует ли файл._
- `fs ::`[`size()`](#method-size) - _Возвращает размер файла в байтах._
- `fs ::`[`isFile()`](#method-isfile) - _Проверяет, является ли указанный путь файлом._
- `fs ::`[`isDir()`](#method-isdir) - _Проверяет, является ли указанный путь папкой._
- `fs ::`[`isHidden()`](#method-ishidden) - _Проверяет, является ли указанный путь скрытым системой._
- `fs ::`[`time()`](#method-time) - _Возвращает последнее время модификации пути в unix timestamp (млсек)._
- `fs ::`[`makeDir()`](#method-makedir) - _Создает папку по указаному пути если их еще нет._
- `fs ::`[`makeFile()`](#method-makefile) - _Создает пустой файл, если файл уже существует, перезаписывает его._
- `fs ::`[`delete()`](#method-delete) - _Удаляет файл или папку (с очисткой)._
- `fs ::`[`clean()`](#method-clean) - _Удаляет все файлы найденные по указанному пути. Метод не удаляет саму указанную директорию._
- `fs ::`[`scan()`](#method-scan) - _Сканирует директорию с коллбэком или фильтром, и может возвращать список найденного, если_
- `fs ::`[`crc32()`](#method-crc32) - _Возвращает crc32 сумму файла или потока (stream), null если неудача!_
- `fs ::`[`hash()`](#method-hash) - _Возвращает хеш файла или потока (stream), по-умолчанию MD5._
- `fs ::`[`copy()`](#method-copy) - _Копирует из одного файла/потока(stream) в другой файл/поток._
- `fs ::`[`move()`](#method-move) - _Переименновывает или перемещает файл, либо пустую папку._
- `fs ::`[`rename()`](#method-rename) - _Задает файлу новое название, возвращает true при успехе._
- `fs ::`[`get()`](#method-get) - _Возвращает данные полученные из потока или файла в виде бинарной строки._
- `fs ::`[`parseAs()`](#method-parseas) - _Читает данные в переданном формате из источника и возвращает результат._
- `fs ::`[`parse()`](#method-parse) - _Читает данные в формате на основе расширения пути из источника и возвращает результат._
- `fs ::`[`formatAs()`](#method-formatas) - _Записывает данные в нужном формате._
- `fs ::`[`format()`](#method-format) - _Записывает данные в нужном формате на основе расширения._
- `fs ::`[`match()`](#method-match) - _Tells if given path matches this matcher's pattern._