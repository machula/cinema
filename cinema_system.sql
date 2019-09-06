--
-- Скрипт сгенерирован Devart dbForge Studio 2019 for MySQL, Версия 8.1.22.0
-- Домашняя страница продукта: http://www.devart.com/ru/dbforge/mysql/studio
-- Дата скрипта: 06-Sep-19 02:31:59 PM
-- Версия сервера: 8.0.17
-- Версия клиента: 4.1
--

-- 
-- Отключение внешних ключей
-- 
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;

-- 
-- Установить режим SQL (SQL mode)
-- 
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 
-- Установка кодировки, с использованием которой клиент будет посылать запросы на сервер
--
SET NAMES 'utf8';

--
-- Установка базы данных по умолчанию
--
USE cinema_system;

--
-- Удалить таблицу `tickets`
--
DROP TABLE IF EXISTS tickets;

--
-- Удалить таблицу `seats`
--
DROP TABLE IF EXISTS seats;

--
-- Удалить таблицу `sessions`
--
DROP TABLE IF EXISTS sessions;

--
-- Удалить таблицу `films`
--
DROP TABLE IF EXISTS films;

--
-- Удалить таблицу `halls`
--
DROP TABLE IF EXISTS halls;

--
-- Установка базы данных по умолчанию
--
USE cinema_system;

--
-- Создать таблицу `halls`
--
CREATE TABLE halls (
  ID int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  number decimal(10, 0) NOT NULL,
  max_places int(255) UNSIGNED DEFAULT 0,
  max_vip_places int(11) UNSIGNED DEFAULT 0,
  rows_number int(11) UNSIGNED DEFAULT 0,
  column_number int(11) DEFAULT 0,
  PRIMARY KEY (ID)
)
ENGINE = INNODB,
AUTO_INCREMENT = 4,
AVG_ROW_LENGTH = 5461,
CHARACTER SET utf8mb4,
COMMENT = 'Залы в кинотеатре';

--
-- Создать индекс `FK_halls` для объекта типа таблица `halls`
--
ALTER TABLE halls
ADD INDEX FK_halls (max_places);

--
-- Создать таблицу `films`
--
CREATE TABLE films (
  ID int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  title varchar(50) DEFAULT NULL,
  standart_price float UNSIGNED DEFAULT NULL,
  premier_date date DEFAULT NULL,
  end_date date DEFAULT NULL,
  PRIMARY KEY (ID)
)
ENGINE = INNODB,
AUTO_INCREMENT = 6,
AVG_ROW_LENGTH = 4096,
CHARACTER SET utf8mb4;

--
-- Создать таблицу `sessions`
--
CREATE TABLE sessions (
  ID int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  date date DEFAULT NULL,
  time time DEFAULT NULL,
  Film int(11) UNSIGNED NOT NULL,
  Hall int(11) UNSIGNED NOT NULL,
  session_price float DEFAULT 0,
  vip_price float DEFAULT 0,
  free_places int(11) DEFAULT 0,
  amount_cash float DEFAULT 0,
  PRIMARY KEY (ID)
)
ENGINE = INNODB,
AUTO_INCREMENT = 7,
AVG_ROW_LENGTH = 8192,
CHARACTER SET utf8mb4;

--
-- Создать внешний ключ
--
ALTER TABLE sessions
ADD CONSTRAINT FK_sessions_films_ID FOREIGN KEY (Film)
REFERENCES films (ID);

--
-- Создать внешний ключ
--
ALTER TABLE sessions
ADD CONSTRAINT FK_sessions_halls_ID FOREIGN KEY (Hall)
REFERENCES halls (ID);

--
-- Создать таблицу `seats`
--
CREATE TABLE seats (
  ID int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  seat_row int(11) UNSIGNED DEFAULT NULL,
  place_in_row int(11) DEFAULT NULL,
  is_booked tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (ID)
)
ENGINE = INNODB,
AUTO_INCREMENT = 4,
AVG_ROW_LENGTH = 8192,
CHARACTER SET utf8mb4;

--
-- Создать таблицу `tickets`
--
CREATE TABLE tickets (
  ID int(11) NOT NULL AUTO_INCREMENT,
  Session int(11) UNSIGNED NOT NULL,
  final_price float DEFAULT NULL,
  Seat int(11) UNSIGNED NOT NULL,
  PRIMARY KEY (ID)
)
ENGINE = INNODB,
AUTO_INCREMENT = 2,
CHARACTER SET utf8mb4;

--
-- Создать внешний ключ
--
ALTER TABLE tickets
ADD CONSTRAINT FK_ticket_seat_ID FOREIGN KEY (Seat)
REFERENCES seats (ID);

--
-- Создать внешний ключ
--
ALTER TABLE tickets
ADD CONSTRAINT FK_ticket_sessions_ID FOREIGN KEY (Session)
REFERENCES sessions (ID);

-- 
-- Вывод данных для таблицы halls
--
INSERT INTO halls VALUES
(1, 1, 40, 10, 4, 10),
(2, 2, 30, 10, 3, 10),
(3, 3, 60, 10, 6, 10);

-- 
-- Вывод данных для таблицы films
--
INSERT INTO films VALUES
(1, 'Avangers Final', 60, '2019-09-01', '2019-09-30'),
(2, 'Deadpool 2', 70, '2019-09-03', '2019-09-18'),
(3, 'Godzila II', 80, '2019-08-08', '2019-10-31'),
(4, 'Not Valid Date Film ', 0, '2019-05-01', '2019-08-16');

-- 
-- Вывод данных для таблицы sessions
--
INSERT INTO sessions VALUES
(4, '2019-09-03', '17:40:00', 1, 1, 0, 120, 0, 0),
(6, '2019-09-05', '20:00:00', 2, 2, 0, 160, 0, 0);

-- 
-- Вывод данных для таблицы seats
--
INSERT INTO seats VALUES
(1, 4, 7, 1),
(2, 4, 6, 1),
(3, 4, 5, 1);

-- 
-- Вывод данных для таблицы tickets
--
INSERT INTO tickets VALUES
(1, 6, 0, 1);

-- 
-- Восстановить предыдущий режим SQL (SQL mode)
-- 
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;

-- 
-- Включение внешних ключей
-- 
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;