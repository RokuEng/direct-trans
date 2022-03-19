--
-- PostgreSQL database cluster dump
--

-- Started on 2022-03-19 11:32:13

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;

--
-- Roles
--

CREATE ROLE postgres;
ALTER ROLE postgres WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:Vdyx1jvLDxB4OZMKM5YhYg==$vUXPL4KHbhjnhWFyBs/bp1UIql5OSCJXIH/PpFTGszg=:dD+5EhcZLBNUEwKnve/2Ta63r8AHnlsApfAKnJs1pOQ=';






--
-- Databases
--

--
-- Database "template1" dump
--

\connect template1

--
-- PostgreSQL database dump
--

-- Dumped from database version 14.2
-- Dumped by pg_dump version 14.2

-- Started on 2022-03-19 11:32:13

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

-- Completed on 2022-03-19 11:32:13

--
-- PostgreSQL database dump complete
--

--
-- Database "Transport Directory" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 14.2
-- Dumped by pg_dump version 14.2

-- Started on 2022-03-19 11:32:13

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3310 (class 1262 OID 16421)
-- Name: Transport Directory; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "Transport Directory" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';


ALTER DATABASE "Transport Directory" OWNER TO postgres;

\connect -reuse-previous=on "dbname='Transport Directory'"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 209 (class 1259 OID 16422)
-- Name: transport; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.transport (
    transport_carnumber text NOT NULL,
    transport_model text NOT NULL,
    transport_category text NOT NULL,
    transport_mark text NOT NULL,
    transport_hastrailer boolean NOT NULL,
    transport_productionyear integer NOT NULL,
    transport_tstype text NOT NULL
);


ALTER TABLE public.transport OWNER TO postgres;

--
-- TOC entry 3304 (class 0 OID 16422)
-- Dependencies: 209
-- Data for Name: transport; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.transport (transport_carnumber, transport_model, transport_category, transport_mark, transport_hastrailer, transport_productionyear, transport_tstype) FROM stdin;
А100УН	Gate	L5	Renault	t	1971	Автомобиль-тягач
У101УН	Assistance	L7	Datsun	t	1912	Специальный легковой автомобиль
С102ЕЕ	Skill	N2	Datsun	f	1990	Прочее
С103СТ	Editor	L5	Lexus	f	1953	Легковой автомобиль общего назначения
Е104АС	Fortune	L3	Lada	f	1933	Специальный автобус
В105ВО	Rio	M2	BMW	t	2022	Специальный грузовой автомобиль
С106ЕС	Union	L6	Datsun	f	1961	Сочлененный автобус
А107УВ	Skill	L7	Renault	t	1945	Сочлененный автобус
О108АМ	Gate	N2	Kia	t	1933	Специальный легковой автомобиль
С109ТК	Fortune	M1	Kamaz	t	1940	Грузовой автомобиль общего назначения
О110СВ	Gate	M1	BMW	f	1926	Легковой автомобиль общего назначения
С111КУ	Gate	M1	Honda	t	1942	Легковой автомобиль общего назначения
Н112ХА	Fortune	L3	Kamaz	t	2005	Автомобиль-тягач
О113ВЕ	Map	M2	Honda	t	1950	Автобус общего назначения
Х114УН	Rio	N1	BMW	t	1928	Микроавтобус
О115РА	Rio	M2	Toyota	f	1951	Прочее
Х116ОК	Rio	N3	Ford	t	2011	Легковой автомобиль общего назначения
Х117УУ	Map	L7	Honda	f	1920	Автобус общего назначения
К118МР	Assistance	N3	Kamaz	t	1951	Сочлененный автобус
Х119ТВ	Assistance	L4	Mazda	t	1997	Микроавтобус
М120РО	Gate	N3	Kia	f	1978	Специальный автобус
Х121КВ	Assistance	N2	BMW	t	1974	Специальный легковой автомобиль
Р122УТ	Map	M2	Volkswagen	t	1948	Микроавтобус
Х123РН	Fortune	L5	Mazda	t	1972	Автомобиль-тягач
О124ЕМ	Road	M3	Ford	f	2011	Специальный грузовой автомобиль
В125ВР	Editor	N2	Nissan	t	1962	Грузопассажирский автомобиль
Р126ЕХ	Map	M3	Hyundai	f	1973	Специальный грузовой автомобиль
В127ХХ	Rio	N1	Kamaz	t	2020	Специальный автобус
У128ТУ	Assistance	L2	Mitsubishi	f	2011	
Т129УУ	Editor	L6	Renault	f	2016	Грузовой автомобиль общего назначения
Х130ЕС	Freedom	N1	Hyundai	f	1906	Автомобиль-тягач
О131ВЕ	Freedom	M2	Lexus	f	1901	Автобус общего назначения
Р132СК	Fortune	M1	Skoda	f	1968	Специальный легковой автомобиль
М133НХ	Union	L5	Volkswagen	f	2018	Сочлененный автобус
В134ТМ	Freedom	L3	Datsun	t	1969	Сочлененный автобус
А135ВО	Rio	M3	Audi	f	1996	Специальный автобус
Р136ОА	Road	M1	Datsun	f	1949	Автомобиль-тягач
К137ОУ	Assistance	L2	Volkswagen	f	1978	Сочлененный автобус
А138МН	Skill	N1	Ford	t	1936	Грузопассажирский автомобиль
Х139ЕМ	Map	L2	Lada	t	2000	Грузовой автомобиль общего назначения
О140УН	Freedom	L2	Honda	t	1973	Седельный тягач
С141МК	Rio	M2	Daihatsu	f	1954	Микроавтобус
Т142СУ	Road	N3	BMW	f	1990	Грузовой автомобиль общего назначения
В143УР	Union	M3	Hyundai	t	1918	
Н144ЕК	Map	L7	Volkswagen	t	2010	Прочее
О145УО	Map	L1	Toyota	t	1925	Легковой автомобиль общего назначения
К146ОУ	Gate	L3	Lada	t	1982	Грузовой автомобиль общего назначения
Х147УТ	Rio	L3	Mitsubishi	f	1931	Легковой автомобиль общего назначения
М148РТ	Union	L2	Datsun	t	1937	
С149РО	Freedom	L7	Daihatsu	f	2000	Специальный легковой автомобиль
Н150РК	Union	M2	Datsun	f	1979	Микроавтобус
Н151ВН	Road	N1	Hyundai	f	1904	Микроавтобус
С152НХ	Freedom	L5	Mitsubishi	t	1976	Микроавтобус
Т153НТ	Editor	L7	Renault	f	1983	Специальный грузовой автомобиль
Т154УО	Fortune	L6	Nissan	t	1984	Прочее
Р155МХ	Skill	N2	Mitsubishi	f	1978	Седельный тягач
К156ЕУ	Road	L5	Hyundai	f	1909	
Н157ТК	Assistance	L2	Kamaz	t	2017	Автобус общего назначения
В158МК	Map	L2	Mitsubishi	t	1965	Прочее
У159НА	Map	M1	Subaru	t	1910	Автомобиль-тягач
О160ХУ	Union	L7	Renault	t	2012	Сочлененный автобус
Р161АН	Skill	L3	Daihatsu	f	2017	Грузопассажирский автомобиль
Н162РН	Road	L7	Honda	t	2010	Легковой автомобиль общего назначения
Е163ВО	Fortune	L6	Skoda	f	1913	Автомобиль-тягач
В164ОР	Rio	M3	Volkswagen	f	1932	Грузовой автомобиль общего назначения
М165СТ	Map	M2	Skoda	f	1992	
А166СХ	Editor	L6	Nissan	f	2002	Грузопассажирский автомобиль
Н167ВС	Assistance	N3	Lexus	t	1910	Грузовой автомобиль общего назначения
Р168КУ	Gate	N1	Volkswagen	t	1962	Седельный тягач
Т169ЕС	Fortune	N3	Mitsubishi	t	1908	Легковой автомобиль общего назначения
М170КК	Map	L2	Mitsubishi	f	1971	Легковой автомобиль общего назначения
Н171НА	Road	L5	Daihatsu	t	1908	Специальный легковой автомобиль
Н172НТ	Road	M1	Lexus	t	1974	Сочлененный автобус
У173ХМ	Fortune	N1	Hyundai	t	2008	
Е174НН	Freedom	N2	Kia	f	1972	Автобус общего назначения
К175МВ	Road	L3	Hyundai	t	2022	Грузовой автомобиль общего назначения
У176АН	Editor	M3	Renault	t	1968	Седельный тягач
Р177УТ	Freedom	L7	Honda	f	1952	
С178ВН	Gate	M3	Mitsubishi	t	1972	Автомобиль-тягач
В179МК	Editor	L5	Skoda	t	1952	Специальный автобус
М180ЕА	Union	L6	Kamaz	f	2016	Сочлененный автобус
Х181НХ	Skill	L1	Renault	t	1986	
С182РУ	Rio	L3	Volkswagen	t	1929	Специальный автобус
У183ТР	Map	L6	Skoda	t	1922	
Н184СХ	Map	M2	Ford	f	1959	Специальный легковой автомобиль
А185АЕ	Union	M3	Kamaz	t	1905	Специальный легковой автомобиль
Т186ЕО	Gate	L7	Volkswagen	t	1931	Специальный грузовой автомобиль
В187УС	Map	L3	Daihatsu	t	1915	Автомобиль-тягач
У188ТТ	Gate	L6	Nissan	f	1920	Сочлененный автобус
У189АН	Union	L7	Audi	f	1919	
В190ВЕ	Union	L6	Subaru	f	2016	Грузопассажирский автомобиль
Х191РВ	Union	L2	Honda	f	2004	Грузопассажирский автомобиль
М192УХ	Freedom	N2	Volkswagen	t	1962	Грузовой автомобиль общего назначения
С193АС	Map	N2	Mitsubishi	f	1963	Грузовой автомобиль общего назначения
Р194УХ	Freedom	M3	Skoda	t	2021	Микроавтобус
Е195ОА	Rio	L4	Mazda	t	1904	Грузопассажирский автомобиль
Е196ХМ	Assistance	L4	Toyota	f	1988	Автомобиль-тягач
М197УЕ	Fortune	N2	Kia	t	2015	Специальный легковой автомобиль
М198РМ	Rio	L4	Audi	f	1969	Прочее
Р199ЕМ	Skill	N3	Kia	t	1963	Автомобиль-тягач
У200НУ	Union	L7	Subaru	f	1999	Прочее
Р201ТМ	Fortune	L3	Daihatsu	t	1907	Автобус общего назначения
Т202УК	Assistance	N1	Audi	f	1951	Грузовой автомобиль общего назначения
А203ЕХ	Editor	L3	Subaru	f	1978	Автомобиль-тягач
С204МР	Freedom	L6	Renault	f	2003	Седельный тягач
О205ОТ	Fortune	L6	Hyundai	f	1918	
К206РР	Freedom	N3	Lada	f	1940	
А207МК	Gate	L7	Kia	t	1927	Специальный грузовой автомобиль
Е208ОЕ	Assistance	N3	Kia	f	1903	Прочее
М209РУ	Editor	L4	Daihatsu	t	1914	Седельный тягач
О210МХ	Map	L1	Lexus	t	1964	Прочее
С211ВЕ	Editor	L7	Mazda	f	1957	Седельный тягач
О212РВ	Editor	L6	Mazda	f	1988	Микроавтобус
О213ХН	Road	L6	Volkswagen	f	1901	Микроавтобус
Н214ВВ	Union	N2	Datsun	t	1929	Автобус общего назначения
К215ТН	Gate	M2	Audi	f	1969	Специальный легковой автомобиль
Х216МС	Union	L6	Lada	t	1972	Легковой автомобиль общего назначения
М217ВО	Rio	L2	Honda	f	2009	Легковой автомобиль общего назначения
С218АО	Map	N1	Ford	f	2002	Специальный автобус
Т219МО	Editor	L7	Volkswagen	f	1948	Прочее
У220ЕС	Gate	L4	Skoda	t	2022	
У221МЕ	Map	N3	Ford	t	1903	Автомобиль-тягач
С222ТЕ	Map	M3	Lada	f	1925	Микроавтобус
С223РХ	Editor	N2	Ford	t	1955	Автобус общего назначения
Н224ХЕ	Gate	L6	Daihatsu	t	1953	Грузовой автомобиль общего назначения
Х225ХС	Freedom	M2	Ford	t	1947	Сочлененный автобус
К226КН	Road	N3	Hyundai	t	1926	Специальный автобус
С227ВН	Map	N1	BMW	f	1909	Специальный автобус
Н228ТР	Editor	N1	Mitsubishi	f	1998	Специальный автобус
У229ОУ	Union	N2	Lexus	f	1989	Специальный легковой автомобиль
С230УВ	Fortune	L5	Volkswagen	f	1938	Прочее
К231УТ	Skill	L4	Volkswagen	f	1952	Микроавтобус
А232РВ	Rio	L3	Lada	t	1987	Микроавтобус
Х233СВ	Fortune	M3	Subaru	t	1908	Прочее
Е234РА	Road	M3	Toyota	t	1919	Микроавтобус
О235УН	Editor	L1	Toyota	f	1989	Специальный автобус
Р236ТВ	Map	L7	Toyota	t	1951	Легковой автомобиль общего назначения
С237НО	Road	M2	Toyota	t	2013	Сочлененный автобус
В238УЕ	Union	N1	Hyundai	f	1957	Грузопассажирский автомобиль
Х239СЕ	Editor	N1	Ford	f	1911	Специальный легковой автомобиль
Р240ХР	Assistance	L5	BMW	t	1907	Грузовой автомобиль общего назначения
О241МО	Rio	L7	Renault	t	1968	Сочлененный автобус
У242КР	Rio	N3	Toyota	f	2022	Сочлененный автобус
Р243ЕО	Assistance	M2	BMW	f	1920	Специальный грузовой автомобиль
М244ОР	Assistance	L5	Lada	t	2015	Седельный тягач
Х245ОС	Fortune	L6	BMW	t	1947	Автомобиль-тягач
А246ЕО	Union	L4	Nissan	f	2022	Автобус общего назначения
О247НУ	Union	L4	Skoda	f	1984	Седельный тягач
Р248СВ	Union	L5	BMW	f	1969	Прочее
Е249ЕН	Rio	N3	Kamaz	t	2001	Автобус общего назначения
А250ТЕ	Freedom	M3	Datsun	t	1937	Микроавтобус
О251ЕК	Skill	L2	Mitsubishi	t	1916	Сочлененный автобус
Х252ХС	Rio	L2	Lada	t	1927	Грузовой автомобиль общего назначения
О253ОА	Fortune	N2	Ford	t	1966	Специальный легковой автомобиль
О254АЕ	Freedom	L6	Datsun	f	1984	Автобус общего назначения
Е255АЕ	Union	L3	BMW	t	1976	Автомобиль-тягач
Х256ВЕ	Assistance	L4	Mazda	t	1938	Автомобиль-тягач
А257РТ	Gate	M2	Daihatsu	t	1972	Грузовой автомобиль общего назначения
К258ВТ	Skill	L6	Honda	f	1962	Специальный автобус
Т259ТН	Fortune	L3	Mitsubishi	f	1978	
Р260ОТ	Map	N3	Ford	t	1903	Прочее
М261ТВ	Fortune	L3	Kia	t	1958	
Р262ТС	Road	M1	Renault	f	1928	Грузопассажирский автомобиль
С263СХ	Assistance	L1	Honda	t	1945	Автомобиль-тягач
У264ОУ	Map	M2	Lada	f	1907	Специальный грузовой автомобиль
Р265ТА	Gate	N3	Mitsubishi	t	1949	Грузовой автомобиль общего назначения
Р266ОХ	Editor	N1	Audi	t	1949	Прочее
К267АС	Editor	L5	BMW	f	1908	
Т268ХН	Editor	L6	Skoda	t	2013	
М269РХ	Gate	L3	Subaru	t	1975	Сочлененный автобус
А270УХ	Gate	M2	Lada	t	1907	Специальный автобус
С271РА	Freedom	L7	Skoda	t	1964	Прочее
М272КХ	Editor	L6	Lada	f	2005	Микроавтобус
А273ТС	Gate	N3	Honda	t	1925	Седельный тягач
Р274ЕУ	Skill	N2	Renault	f	2021	Грузовой автомобиль общего назначения
Е275РХ	Fortune	N1	Skoda	t	1948	Легковой автомобиль общего назначения
Е276РА	Gate	L2	Mazda	f	1906	Специальный автобус
Р277УС	Skill	L1	Kia	f	1924	Грузопассажирский автомобиль
В278НО	Gate	N3	Volkswagen	t	1963	Микроавтобус
Н279УХ	Road	N3	Datsun	f	2001	Автобус общего назначения
Х280АУ	Freedom	M2	Renault	t	1941	Грузопассажирский автомобиль
В281ВТ	Editor	L6	Renault	f	1995	Автомобиль-тягач
Р282МТ	Union	L6	BMW	t	1920	Специальный легковой автомобиль
В283ВН	Road	L6	Honda	f	1979	Легковой автомобиль общего назначения
Х284ХТ	Skill	L1	Audi	t	1945	Седельный тягач
О285НТ	Rio	L3	Lexus	t	2005	Специальный легковой автомобиль
Р286РЕ	Rio	L2	Lada	f	2016	Микроавтобус
Х287УМ	Gate	L1	Audi	t	1911	Прочее
К288АР	Fortune	L4	Renault	t	1932	Легковой автомобиль общего назначения
А289ЕО	Freedom	L1	Ford	t	1907	Сочлененный автобус
У290ТМ	Assistance	L1	Toyota	f	1945	Сочлененный автобус
В291КМ	Fortune	L2	Renault	f	1908	Специальный грузовой автомобиль
Х292АК	Union	M2	BMW	t	1903	Грузовой автомобиль общего назначения
К293КР	Editor	L5	Daihatsu	f	1931	Автомобиль-тягач
У294МК	Skill	L6	Mazda	f	1964	Микроавтобус
В295АХ	Road	L6	Datsun	f	1942	Микроавтобус
У296АТ	Road	N2	Kamaz	f	2009	Седельный тягач
Р297КТ	Map	M3	Daihatsu	f	1989	Автомобиль-тягач
Н298НХ	Fortune	L4	Toyota	f	1906	Грузопассажирский автомобиль
В299ВХ	Editor	L5	BMW	f	1953	Автобус общего назначения
У300НК	Fortune	L4	Lexus	t	1957	Грузопассажирский автомобиль
Т301ВМ	Assistance	N2	BMW	f	1934	Автобус общего назначения
С302МЕ	Rio	M2	Nissan	f	1901	Специальный грузовой автомобиль
Х303ТМ	Editor	N1	Kia	f	1970	Сочлененный автобус
М304ХЕ	Assistance	L3	Subaru	f	1953	Автобус общего назначения
Е305РН	Editor	L1	Daihatsu	f	1905	Автобус общего назначения
Н306СХ	Assistance	L4	Mitsubishi	t	1994	Микроавтобус
К307РВ	Gate	L4	Daihatsu	t	1902	Автомобиль-тягач
Т308ОО	Fortune	L5	Hyundai	t	2007	Грузопассажирский автомобиль
О309КТ	Freedom	L3	Nissan	t	1904	Автобус общего назначения
Х310ЕЕ	Editor	L3	Honda	t	1959	Прочее
Р311ЕХ	Gate	L7	Lada	f	2016	Специальный грузовой автомобиль
М312ТМ	Road	M1	Honda	f	1937	Специальный автобус
О313ЕХ	Fortune	L6	Renault	t	1961	Специальный автобус
С314ХХ	Assistance	L2	Kamaz	f	1980	Автомобиль-тягач
Е315НВ	Union	L1	Renault	f	1942	Автомобиль-тягач
К316ВК	Road	L7	BMW	t	2000	Микроавтобус
У317РС	Map	M1	Subaru	t	1927	Специальный автобус
О318НВ	Assistance	L1	Mitsubishi	t	1998	Седельный тягач
Н319ТК	Union	M3	Kia	t	1912	Специальный автобус
В320ВН	Assistance	L4	Daihatsu	t	1999	Микроавтобус
О321ММ	Skill	N2	Subaru	f	1997	Автобус общего назначения
Т322ОМ	Union	L7	Ford	f	1969	
Х323ЕН	Union	L5	Kamaz	t	1962	Специальный грузовой автомобиль
Е324НА	Skill	L4	Kamaz	f	1960	Седельный тягач
Р325ХН	Union	N3	Kia	f	1962	Легковой автомобиль общего назначения
Н326АР	Union	M1	Lexus	t	2006	Грузопассажирский автомобиль
М327ВМ	Fortune	L6	Honda	t	1902	Микроавтобус
Т328ТО	Fortune	N2	BMW	f	2018	Грузовой автомобиль общего назначения
Е329ХХ	Assistance	L7	Mitsubishi	f	2015	Микроавтобус
К330УВ	Freedom	L7	Toyota	t	2001	Автомобиль-тягач
Е331МО	Fortune	L7	Lexus	f	1942	Седельный тягач
Р332ВТ	Skill	L6	Toyota	t	1925	Грузопассажирский автомобиль
В333ХЕ	Fortune	M1	Honda	f	1932	Микроавтобус
С334ХМ	Road	N1	BMW	t	1925	
М335УР	Gate	M1	Lexus	t	1922	
Т336ОН	Freedom	L3	BMW	f	1996	Автобус общего назначения
Т337НН	Assistance	L7	Datsun	f	2013	Прочее
В338ОХ	Editor	L5	Kamaz	t	1962	Специальный легковой автомобиль
С339ОА	Fortune	L1	Subaru	f	1963	Специальный легковой автомобиль
Т340КК	Fortune	N3	BMW	t	1943	Специальный грузовой автомобиль
М341СМ	Editor	M3	Mitsubishi	f	1958	Специальный грузовой автомобиль
Х342ТА	Union	L7	Kia	t	1913	Грузопассажирский автомобиль
М343УЕ	Road	M3	Renault	t	2000	Автобус общего назначения
У344ЕО	Gate	L1	Audi	t	1974	Легковой автомобиль общего назначения
С345ХУ	Editor	L7	Daihatsu	t	1961	Автобус общего назначения
А346КН	Assistance	L5	Audi	f	1938	Грузовой автомобиль общего назначения
С347ТК	Map	L4	Datsun	f	1952	Грузовой автомобиль общего назначения
Е348УУ	Assistance	L6	Mitsubishi	t	1949	Автобус общего назначения
О349ЕВ	Gate	N1	Subaru	f	1948	Специальный легковой автомобиль
Н350НН	Assistance	L1	Mazda	f	1911	Сочлененный автобус
Х351ВР	Freedom	M1	Lexus	f	1956	
В352АВ	Gate	N2	BMW	t	1918	Легковой автомобиль общего назначения
К353РР	Map	M2	Volkswagen	t	1914	Специальный грузовой автомобиль
Е354ТВ	Freedom	M3	Audi	t	1910	Специальный автобус
С355ХЕ	Assistance	L6	Datsun	t	2013	Микроавтобус
К356УУ	Union	M2	Ford	t	1935	Специальный легковой автомобиль
С357РВ	Union	L7	Datsun	t	1972	Специальный легковой автомобиль
А358АТ	Gate	N1	Audi	t	1933	
А359НХ	Assistance	M2	Kia	f	1976	Автомобиль-тягач
А360АО	Road	L5	Hyundai	t	1939	Седельный тягач
А361КР	Freedom	N2	Ford	t	1976	Автомобиль-тягач
Н362ВВ	Road	L1	Daihatsu	t	2008	Специальный грузовой автомобиль
Е363УА	Map	L3	BMW	f	1987	Прочее
М364ТО	Editor	L6	Skoda	f	1903	Грузовой автомобиль общего назначения
О365НК	Road	L7	Lada	f	1968	Микроавтобус
Н366ХК	Fortune	L4	Renault	t	1988	Микроавтобус
А367ЕС	Union	L1	Daihatsu	f	1965	Грузовой автомобиль общего назначения
О368ВУ	Map	N1	Nissan	t	2012	Специальный автобус
С369РМ	Fortune	L1	Kia	f	1943	Сочлененный автобус
У370КЕ	Union	L1	Mitsubishi	t	1995	Специальный легковой автомобиль
Н371ВХ	Assistance	L2	Ford	f	2012	Легковой автомобиль общего назначения
Т372УК	Freedom	N1	BMW	f	1961	Специальный легковой автомобиль
Т373РМ	Road	M2	Daihatsu	f	1949	Специальный грузовой автомобиль
У374УЕ	Road	M1	Volkswagen	t	1975	Автобус общего назначения
А375РТ	Union	L6	Hyundai	t	1988	Грузопассажирский автомобиль
Е376МС	Map	M1	BMW	f	1982	Автобус общего назначения
Р377УС	Map	L1	Skoda	f	2004	Специальный автобус
У378КР	Gate	L7	Daihatsu	f	2022	Специальный грузовой автомобиль
М379ВХ	Road	L2	Hyundai	t	1932	Автобус общего назначения
Т380КН	Union	N2	Hyundai	t	1987	Микроавтобус
О381ХМ	Editor	L7	Lexus	f	2010	Грузопассажирский автомобиль
Е382ТН	Union	L1	Ford	t	1980	Микроавтобус
Т383УХ	Map	M3	Lexus	f	1979	Грузопассажирский автомобиль
М384СО	Rio	N2	Datsun	t	1970	Специальный грузовой автомобиль
Т385НО	Road	L2	Audi	f	1914	Автобус общего назначения
К386ЕЕ	Skill	L7	Datsun	t	2012	Автобус общего назначения
К387ТУ	Road	N3	Renault	f	1988	Грузовой автомобиль общего назначения
Х388РУ	Freedom	L7	Volkswagen	f	1927	Специальный автобус
У389НТ	Editor	L5	Skoda	f	1919	Прочее
Е390МР	Gate	L4	Nissan	f	1912	Прочее
У391ХР	Freedom	M1	Volkswagen	f	1968	Автомобиль-тягач
В392ТР	Editor	M2	Nissan	f	1971	Легковой автомобиль общего назначения
В393ОН	Union	N1	Audi	t	1919	Автомобиль-тягач
Р394СТ	Assistance	M3	Daihatsu	f	1906	Автомобиль-тягач
Х395КО	Road	L2	Hyundai	t	1956	Специальный автобус
А396ЕН	Fortune	L4	Kamaz	f	1918	
Т397УН	Union	L1	Datsun	t	1904	Автобус общего назначения
Р398МС	Freedom	M3	Lada	t	1984	Специальный легковой автомобиль
Е399НС	Map	L2	Lexus	t	1908	Специальный легковой автомобиль
Р400РС	Skill	L4	Kamaz	f	1902	Грузовой автомобиль общего назначения
А401ТВ	Editor	L7	Toyota	f	1940	Сочлененный автобус
С402АР	Map	N2	Lexus	t	1988	Легковой автомобиль общего назначения
А403АС	Skill	L5	Honda	f	1990	
В404ЕА	Fortune	L5	Mitsubishi	t	1932	Автобус общего назначения
Н405ЕТ	Fortune	L7	Lada	f	1994	Грузовой автомобиль общего назначения
Н406ЕУ	Map	L4	Daihatsu	f	1960	Автобус общего назначения
Х407ХА	Assistance	N1	Kia	t	1930	Легковой автомобиль общего назначения
Е408ЕХ	Union	L7	Renault	f	1986	Седельный тягач
А409ЕО	Union	M1	BMW	t	2021	
У410НМ	Map	M2	Renault	f	1912	Специальный легковой автомобиль
У411ЕН	Gate	M3	Toyota	f	1970	Сочлененный автобус
Х412ЕН	Skill	L5	Kamaz	f	2000	Грузопассажирский автомобиль
У413УТ	Rio	N1	Honda	t	2011	Специальный грузовой автомобиль
Е414АВ	Rio	L7	Audi	f	1912	Легковой автомобиль общего назначения
Х415АК	Fortune	N1	Subaru	f	1993	Автомобиль-тягач
М416НМ	Road	M1	Lexus	t	1961	Специальный автобус
К417ТЕ	Gate	M3	Ford	f	1987	Микроавтобус
А418АА	Gate	L2	Ford	f	1965	Сочлененный автобус
В419ВА	Fortune	M1	Mazda	f	1904	Микроавтобус
В420АС	Map	M1	Hyundai	t	1961	Микроавтобус
В421ЕМ	Assistance	M1	Hyundai	f	1983	Прочее
А422АХ	Fortune	N2	Skoda	f	1929	Специальный грузовой автомобиль
С423ХВ	Gate	L1	Datsun	t	1928	Грузовой автомобиль общего назначения
Е424ВА	Fortune	L4	Honda	f	1937	Специальный легковой автомобиль
Х425СМ	Road	M2	Lexus	t	1928	Прочее
Е426НС	Fortune	M3	Lada	f	1918	Прочее
К427ВН	Road	L5	Mazda	t	1932	
Р428МХ	Union	L2	Nissan	f	1919	Специальный легковой автомобиль
Е429СР	Editor	L1	Lada	t	1975	Специальный легковой автомобиль
О430ОМ	Skill	N1	Kamaz	t	2020	
Т431ХЕ	Gate	L1	Mitsubishi	t	1951	Седельный тягач
А432МА	Assistance	L3	Daihatsu	f	1912	Специальный автобус
С433МН	Freedom	L3	Honda	f	1938	Специальный автобус
Х434ВЕ	Map	N2	Audi	t	1947	Автомобиль-тягач
Р435УТ	Map	L5	Mitsubishi	f	2004	Грузовой автомобиль общего назначения
У436ТС	Editor	L7	Kamaz	f	1918	Грузопассажирский автомобиль
С437ТК	Road	N1	Subaru	f	1987	Грузопассажирский автомобиль
Х438АО	Map	L7	Toyota	f	1918	Легковой автомобиль общего назначения
О439РТ	Gate	M1	Lexus	f	1956	Специальный автобус
А440МЕ	Gate	L1	Daihatsu	f	1957	Специальный автобус
Р441АМ	Gate	M2	Mitsubishi	t	2016	Грузовой автомобиль общего назначения
А442УН	Assistance	M1	Mitsubishi	f	2015	Специальный грузовой автомобиль
В443СН	Fortune	N3	Kia	f	1973	Прочее
О444СУ	Skill	L1	Volkswagen	f	1966	Легковой автомобиль общего назначения
В445КС	Road	L2	Hyundai	f	1917	Легковой автомобиль общего назначения
М446РТ	Assistance	N1	Mazda	t	1906	Специальный легковой автомобиль
У447РА	Rio	N2	Lada	t	2018	Сочлененный автобус
У448РМ	Gate	L3	Renault	t	2002	Специальный автобус
Р449КК	Assistance	N1	Mitsubishi	f	1942	Легковой автомобиль общего назначения
К450МЕ	Rio	N2	BMW	t	1924	Автомобиль-тягач
Е451КВ	Rio	M1	Daihatsu	f	1913	
Е452ТМ	Rio	L2	Lada	f	1968	Легковой автомобиль общего назначения
В453НЕ	Map	N1	BMW	t	1901	Легковой автомобиль общего назначения
О454ММ	Freedom	N2	Toyota	f	2013	Седельный тягач
С455ВА	Freedom	N1	Subaru	f	1975	Специальный грузовой автомобиль
В456ХО	Editor	L6	Volkswagen	f	1916	Сочлененный автобус
К457ОН	Fortune	L4	Subaru	f	1923	Прочее
В458АА	Road	L6	Audi	f	1941	Легковой автомобиль общего назначения
О459РР	Rio	N1	Volkswagen	f	1981	Автобус общего назначения
У460КМ	Editor	L4	Nissan	t	1924	Специальный грузовой автомобиль
Н461ТН	Map	L3	Kia	t	1960	
У462НВ	Skill	N3	Mazda	f	1994	Автомобиль-тягач
Р463СЕ	Assistance	L7	Hyundai	t	1941	Специальный легковой автомобиль
М464ТС	Fortune	L1	Mitsubishi	f	1918	Грузопассажирский автомобиль
В465РХ	Gate	L4	Ford	f	1953	Специальный автобус
М466ТМ	Assistance	L4	Kia	f	2014	Грузовой автомобиль общего назначения
О467СР	Map	M1	Hyundai	f	1965	Специальный автобус
С468ТМ	Skill	M3	Mazda	f	1932	Прочее
О469ЕО	Assistance	L4	Volkswagen	f	1928	
Е470КС	Assistance	L2	Lada	f	2004	Грузовой автомобиль общего назначения
А471МЕ	Freedom	L1	Renault	t	1912	Легковой автомобиль общего назначения
Е472КН	Skill	M2	Lexus	t	1987	Грузовой автомобиль общего назначения
У473КВ	Gate	N1	BMW	t	1946	Грузовой автомобиль общего назначения
Н474НТ	Freedom	N1	Mazda	t	1960	
Е475УО	Road	L3	Datsun	t	2006	Автобус общего назначения
О476НС	Gate	L3	Kamaz	t	1990	Специальный легковой автомобиль
В477ВО	Gate	N3	Ford	f	1920	Автобус общего назначения
Е478АВ	Road	N1	Toyota	f	1959	Специальный легковой автомобиль
М479РН	Assistance	L5	Renault	f	1928	Легковой автомобиль общего назначения
К480ХА	Gate	L5	Kia	t	1943	Специальный легковой автомобиль
В481СС	Gate	M1	Datsun	f	1910	Грузовой автомобиль общего назначения
Е482УН	Gate	N3	Hyundai	t	1912	Специальный грузовой автомобиль
У483ЕО	Gate	L1	Renault	f	1967	Прочее
Т484ЕО	Gate	M3	Hyundai	t	2015	
В485МС	Union	L3	Mitsubishi	t	1912	Сочлененный автобус
С486АТ	Rio	L1	BMW	t	1944	Специальный автобус
М487ВА	Gate	N2	BMW	f	1994	Микроавтобус
С488РК	Rio	M1	Daihatsu	f	1900	Сочлененный автобус
К489КХ	Gate	L6	Audi	f	1918	Автомобиль-тягач
С490ХН	Editor	M1	Audi	f	1930	
У491ХВ	Road	N1	Audi	f	1909	Микроавтобус
Т492РК	Skill	M3	Nissan	f	1956	Прочее
У493ВР	Editor	L1	Mazda	t	1904	Грузопассажирский автомобиль
Е494ОН	Assistance	L7	Ford	t	1997	Грузопассажирский автомобиль
М495СН	Union	M2	Renault	t	1930	Специальный автобус
Т496ТК	Freedom	M2	Lexus	f	2005	Специальный автобус
Т497КМ	Gate	L3	Kia	t	2014	Специальный грузовой автомобиль
У498НВ	Skill	L7	BMW	f	1920	
К499НР	Union	L1	Daihatsu	f	1938	Прочее
Е500ХМ	Fortune	L6	Toyota	t	1924	Грузовой автомобиль общего назначения
У501КО	Map	M2	Kia	f	1956	Автомобиль-тягач
Р502ТУ	Freedom	N2	Daihatsu	t	1923	Автомобиль-тягач
М503МХ	Editor	N3	Kamaz	t	2010	Автобус общего назначения
Е504УС	Skill	L6	Datsun	t	1938	Автомобиль-тягач
Х505РУ	Fortune	N3	Mazda	t	1914	Специальный грузовой автомобиль
С506СТ	Editor	L3	Audi	t	1911	Грузопассажирский автомобиль
М507НЕ	Editor	N3	Subaru	t	2001	Грузовой автомобиль общего назначения
М508НЕ	Gate	L6	Mazda	t	1991	
М509ЕО	Skill	L2	Hyundai	f	2021	Легковой автомобиль общего назначения
Е510ТТ	Skill	L7	Daihatsu	t	1974	Автобус общего назначения
Р511АО	Map	L5	Mitsubishi	t	1958	Специальный грузовой автомобиль
В512ВУ	Union	L4	Subaru	f	1986	Автобус общего назначения
Т513ХУ	Road	N3	Audi	f	1944	Микроавтобус
М514ОС	Rio	M1	Lada	f	1975	
С515ЕВ	Rio	L4	Nissan	t	1975	Прочее
К516РТ	Gate	L2	Datsun	f	2003	Грузовой автомобиль общего назначения
К517ТА	Skill	N2	Hyundai	f	1963	
В518НС	Fortune	L7	Hyundai	t	1939	
Е519КЕ	Fortune	N2	Daihatsu	f	1979	Специальный грузовой автомобиль
Н520ЕО	Union	N1	Nissan	f	1992	Автомобиль-тягач
Е521РМ	Union	M3	BMW	t	1910	Сочлененный автобус
А522АМ	Gate	L2	Ford	f	1930	Микроавтобус
А523ВХ	Freedom	M2	Daihatsu	t	1902	Прочее
Х524СТ	Fortune	L4	Nissan	f	1943	Специальный грузовой автомобиль
Н525УВ	Fortune	L7	Toyota	f	1956	
К526АУ	Rio	N3	Datsun	f	1960	Специальный легковой автомобиль
О527КЕ	Fortune	N1	Hyundai	f	1993	Грузовой автомобиль общего назначения
У528НН	Fortune	L4	Volkswagen	f	1930	Грузопассажирский автомобиль
К529ОС	Freedom	N3	Skoda	f	2015	Микроавтобус
Т530ТС	Freedom	L5	Honda	f	2016	Сочлененный автобус
С531ОР	Union	L2	Mazda	t	1977	Сочлененный автобус
Т532ММ	Skill	L3	Mazda	f	1924	
У533ЕА	Editor	L2	Lada	t	2019	Микроавтобус
Е534ТР	Assistance	L3	Kamaz	f	1964	Автобус общего назначения
М535ВР	Fortune	L7	Volkswagen	f	1993	Специальный автобус
О536ОМ	Freedom	M2	Renault	f	1911	Специальный легковой автомобиль
У537МК	Skill	L4	Daihatsu	t	1913	Микроавтобус
Н538СС	Map	M2	Renault	t	1938	Автобус общего назначения
Н539СХ	Freedom	L6	Kia	t	1906	Специальный автобус
Х540ХТ	Fortune	L2	Honda	t	1942	
А541СМ	Union	L1	Datsun	t	1995	Сочлененный автобус
В542ВТ	Road	L7	Daihatsu	f	1960	
У543УС	Freedom	L6	Kia	f	2006	Микроавтобус
В544ХЕ	Rio	L4	Lexus	t	1907	Специальный автобус
С545СВ	Road	L2	Volkswagen	t	1955	Специальный легковой автомобиль
Т546КС	Gate	L3	Renault	f	2001	Автомобиль-тягач
Н547АК	Fortune	L3	Audi	t	1978	Специальный грузовой автомобиль
М548СО	Road	L1	Honda	t	1919	Сочлененный автобус
Н549НА	Editor	L1	Honda	f	1980	Специальный легковой автомобиль
Х550ЕХ	Editor	L3	Skoda	f	1969	Специальный грузовой автомобиль
Т551ХВ	Map	L2	Renault	t	1905	Сочлененный автобус
Е552РК	Editor	N2	Daihatsu	f	1954	Специальный грузовой автомобиль
В553ЕТ	Union	L6	Mitsubishi	f	1917	Легковой автомобиль общего назначения
К554РТ	Editor	M2	Honda	t	1960	Микроавтобус
Х555ОВ	Freedom	L4	Skoda	t	1973	Седельный тягач
В556УХ	Map	N2	Mazda	t	2016	Грузопассажирский автомобиль
Е557УМ	Union	L6	Mazda	f	2018	Легковой автомобиль общего назначения
В933РН	Freedom	L6	Renault	f	1915	Специальный легковой автомобиль
В558УЕ	Assistance	L1	Lada	t	1982	Грузовой автомобиль общего назначения
Е559ВЕ	Gate	N3	Lexus	t	1915	
Р560МУ	Road	M2	Kamaz	f	1959	Специальный автобус
С561ОО	Fortune	N1	Honda	f	2012	Микроавтобус
Н562НН	Editor	L4	Honda	t	1989	Специальный автобус
Т563ЕС	Map	L5	Skoda	f	1991	Грузовой автомобиль общего назначения
М564ОХ	Skill	L5	Kia	t	1919	Специальный автобус
М565ВО	Gate	L4	Kamaz	t	2011	Грузовой автомобиль общего назначения
Р566АО	Skill	L2	Datsun	f	2005	Автобус общего назначения
К567ВО	Gate	M1	Lada	f	2008	Автобус общего назначения
М568УС	Fortune	N1	Subaru	t	1906	Легковой автомобиль общего назначения
О569ОК	Editor	L7	BMW	f	1941	Легковой автомобиль общего назначения
А570АК	Rio	N1	Skoda	t	1919	Автомобиль-тягач
У571АХ	Road	L2	Lada	f	1965	Автобус общего назначения
С572ТВ	Freedom	N2	Toyota	f	1944	
Х573РС	Assistance	L2	BMW	f	1909	Грузовой автомобиль общего назначения
К574МН	Editor	N1	Daihatsu	t	1962	Микроавтобус
В575ВУ	Gate	N1	Toyota	f	1918	Сочлененный автобус
М576СЕ	Gate	L2	Skoda	f	1964	Сочлененный автобус
О577МС	Assistance	L3	Subaru	t	1996	Грузопассажирский автомобиль
Е578НС	Assistance	M3	Skoda	t	1929	Легковой автомобиль общего назначения
М579АА	Gate	L1	Lada	t	2013	Грузопассажирский автомобиль
Р580МТ	Fortune	M1	Ford	t	1935	Автобус общего назначения
С581МЕ	Union	L7	Toyota	t	1989	Прочее
А582ОА	Road	M3	Kamaz	t	2005	Прочее
Н583НТ	Assistance	M2	Toyota	t	2018	Специальный грузовой автомобиль
В584ХК	Skill	N1	Datsun	t	1920	Грузопассажирский автомобиль
Х585НТ	Skill	N1	Mazda	f	1904	
М586ВХ	Skill	L5	Ford	t	2009	Специальный легковой автомобиль
Т587ОХ	Union	M3	Mitsubishi	f	2012	Прочее
У588АУ	Skill	L5	Datsun	f	2008	Специальный автобус
В589ХО	Freedom	M2	Ford	t	1967	Грузопассажирский автомобиль
М590ЕК	Rio	L2	Toyota	t	1952	Прочее
Т591УМ	Gate	M2	Subaru	t	1937	Седельный тягач
М592ЕК	Map	M3	Subaru	t	1973	Грузопассажирский автомобиль
Х593УР	Map	L5	Honda	t	1977	Легковой автомобиль общего назначения
Х594МВ	Fortune	L2	Mitsubishi	f	1921	Грузопассажирский автомобиль
С595ЕЕ	Editor	L7	Lada	f	1952	
А596ЕО	Gate	L3	Audi	f	1994	Прочее
В597МУ	Assistance	M1	Nissan	t	1915	Сочлененный автобус
У598МТ	Editor	L1	Audi	f	1977	
У599УН	Editor	L7	Honda	t	1994	Грузопассажирский автомобиль
У600ОМ	Skill	L7	Mazda	f	1960	Автобус общего назначения
Х601УР	Gate	L6	Audi	f	1904	Прочее
Е602ТЕ	Freedom	N1	Renault	f	1917	Грузопассажирский автомобиль
Е603АА	Editor	L7	Hyundai	f	1977	
Р604УЕ	Skill	M1	Nissan	t	1961	Легковой автомобиль общего назначения
У605НО	Fortune	L6	Lada	t	1984	Специальный легковой автомобиль
Х606ЕВ	Map	N2	Kia	t	1979	Микроавтобус
А607НН	Freedom	M1	Honda	t	2022	Прочее
А608НС	Fortune	N1	Kamaz	f	1941	Легковой автомобиль общего назначения
Н609ОС	Gate	L3	Kia	t	1968	Специальный автобус
У610ОН	Fortune	N1	Lada	t	1966	
О611ТС	Road	L4	Kamaz	t	1995	Специальный автобус
М612ВТ	Fortune	L5	Skoda	f	1972	Седельный тягач
Н613УА	Gate	L2	Nissan	f	1979	Грузопассажирский автомобиль
Н614КЕ	Assistance	M1	Skoda	f	1920	Седельный тягач
К615ТР	Skill	M1	Daihatsu	f	2002	Автобус общего назначения
А616ТН	Map	L7	Renault	f	2000	Легковой автомобиль общего назначения
В617РЕ	Skill	L7	Renault	f	1900	Автомобиль-тягач
А618УК	Skill	L1	Volkswagen	t	1998	Специальный грузовой автомобиль
Х619АН	Freedom	L1	Honda	t	1914	Прочее
Х620СН	Map	N1	Mazda	f	1922	Седельный тягач
Т621ХВ	Map	L4	Kamaz	t	2008	Прочее
К622МК	Freedom	N3	Skoda	f	1958	Сочлененный автобус
У623УА	Road	N3	Hyundai	f	1956	Грузопассажирский автомобиль
В624МР	Gate	M2	Kamaz	f	1985	Микроавтобус
Н625ХР	Freedom	M2	Nissan	t	1910	Микроавтобус
У626ЕС	Gate	M1	Audi	f	1964	Специальный легковой автомобиль
Е627ВН	Assistance	L5	Hyundai	f	1957	Специальный легковой автомобиль
С628СТ	Fortune	L4	Hyundai	f	1904	Специальный грузовой автомобиль
Н629НР	Assistance	L3	Volkswagen	f	1973	Сочлененный автобус
У630ХР	Union	L7	Kia	f	1964	
Х631ЕР	Assistance	L2	Kamaz	t	1941	Седельный тягач
О632КТ	Freedom	L4	Ford	f	1935	Автомобиль-тягач
О633КО	Rio	M1	Ford	f	1965	
У634РР	Freedom	L4	Kamaz	t	1900	Легковой автомобиль общего назначения
Х635ТР	Skill	M2	Datsun	f	1953	Специальный легковой автомобиль
К636НС	Road	M1	Mazda	t	2013	Грузопассажирский автомобиль
В637АЕ	Assistance	N3	Skoda	f	1926	Микроавтобус
Х638КН	Fortune	L2	Toyota	f	1958	Грузовой автомобиль общего назначения
М639УС	Assistance	N2	Renault	f	1998	Микроавтобус
Р640ММ	Assistance	N1	Daihatsu	t	1900	
С641ЕМ	Skill	N2	Mitsubishi	f	1996	Специальный грузовой автомобиль
Н642СО	Map	M2	Ford	f	1987	Специальный легковой автомобиль
Х643КХ	Editor	N2	Volkswagen	f	1919	Грузовой автомобиль общего назначения
М644ТМ	Gate	N2	Hyundai	t	1907	Специальный автобус
О645УВ	Union	L6	Ford	f	1932	Специальный легковой автомобиль
Т646МВ	Freedom	L4	Audi	t	1912	Специальный легковой автомобиль
Т647РК	Union	L7	Nissan	t	1974	Прочее
У648УТ	Editor	L5	Toyota	t	1910	Легковой автомобиль общего назначения
Н649АВ	Skill	L1	Audi	t	1966	Автомобиль-тягач
В650УС	Assistance	N3	Toyota	f	1923	Специальный автобус
Т651НК	Editor	M1	Datsun	t	1976	
Х652СК	Rio	L4	Kamaz	f	1985	Специальный легковой автомобиль
А653УМ	Map	M2	BMW	f	1953	Грузовой автомобиль общего назначения
Х654ЕТ	Rio	L6	Nissan	t	1993	Автобус общего назначения
М655ОР	Map	N1	Mitsubishi	f	2002	Грузопассажирский автомобиль
У656ВУ	Gate	M1	Audi	t	1927	
С657ХО	Map	L6	Kia	t	1965	Специальный грузовой автомобиль
Х658ТТ	Editor	L4	Datsun	f	1930	Сочлененный автобус
О659АТ	Fortune	N3	Datsun	t	1905	Специальный грузовой автомобиль
Н660РМ	Assistance	L5	Ford	t	1944	Специальный легковой автомобиль
В661ЕВ	Road	M1	Kamaz	t	1901	Прочее
А662ХМ	Skill	M2	Kia	f	1969	Автобус общего назначения
М663КТ	Skill	M3	Skoda	f	1904	Специальный автобус
Х664АТ	Assistance	L1	Subaru	f	1999	Грузовой автомобиль общего назначения
Е665ЕВ	Rio	M1	Toyota	f	1915	
А666ТВ	Assistance	M2	Lada	f	1910	Грузовой автомобиль общего назначения
Е667ХН	Road	L3	Subaru	f	1918	Легковой автомобиль общего назначения
М668АЕ	Freedom	L1	Volkswagen	t	1940	Специальный автобус
М669НВ	Assistance	M1	Skoda	t	1931	Седельный тягач
Т670ХУ	Map	L2	Kamaz	f	1998	Прочее
Х671НС	Rio	L7	Audi	f	1944	Прочее
К672ВА	Rio	N1	Mitsubishi	t	1921	Грузопассажирский автомобиль
С673АН	Assistance	L6	Skoda	t	1905	Грузовой автомобиль общего назначения
С674СМ	Map	M1	Mitsubishi	t	1923	Специальный автобус
О675АА	Gate	L7	Mazda	f	1945	Седельный тягач
Х676НА	Gate	L3	Kamaz	f	1950	Специальный легковой автомобиль
А677ТВ	Rio	M3	Ford	t	1974	Грузопассажирский автомобиль
Е678ОС	Road	L1	Hyundai	f	1934	Сочлененный автобус
В679КР	Map	L3	Kamaz	f	1936	Прочее
У680АР	Fortune	N2	Lada	f	1904	Автомобиль-тягач
Е681ВТ	Rio	N3	Renault	f	1936	Легковой автомобиль общего назначения
Т682АР	Union	L4	Volkswagen	f	1915	Седельный тягач
У683СС	Skill	N3	Ford	f	1932	Специальный автобус
Х684ЕХ	Assistance	M1	Kia	f	1956	Легковой автомобиль общего назначения
А685УР	Rio	N1	Audi	f	1948	Микроавтобус
М686НА	Road	L4	Lexus	f	2019	Прочее
Е687МС	Union	M2	Ford	f	2005	Сочлененный автобус
К688УВ	Fortune	N3	Kamaz	f	1948	Специальный грузовой автомобиль
К689МХ	Rio	L5	Mitsubishi	t	2015	Микроавтобус
С690РТ	Freedom	L2	Nissan	f	1902	Седельный тягач
У691ЕТ	Editor	L5	Skoda	f	1976	Сочлененный автобус
О692ВР	Freedom	L4	BMW	t	2008	Седельный тягач
Х693СА	Assistance	M3	Hyundai	t	2003	Микроавтобус
М694ЕХ	Editor	L5	Subaru	t	1996	Легковой автомобиль общего назначения
Р695КТ	Fortune	M1	Lada	f	1911	Специальный легковой автомобиль
С696УО	Skill	N3	Renault	f	1911	Грузовой автомобиль общего назначения
Р697ОС	Fortune	L5	Kamaz	t	2011	Автомобиль-тягач
В698НЕ	Editor	M1	Lexus	f	1990	Микроавтобус
Х699НА	Map	L6	Ford	f	1906	Прочее
М700НН	Rio	L3	Kamaz	f	1987	Специальный легковой автомобиль
Р701СЕ	Map	L7	Toyota	f	1999	Автобус общего назначения
О702РО	Union	M1	Audi	f	1972	Легковой автомобиль общего назначения
Х703АМ	Fortune	L6	Hyundai	t	1974	Специальный автобус
У704КО	Fortune	L6	Mazda	t	2016	Специальный легковой автомобиль
К705НХ	Road	M1	Daihatsu	t	1986	Микроавтобус
Т706ВР	Skill	L7	Nissan	t	1975	Специальный грузовой автомобиль
М707ВН	Editor	L5	Daihatsu	f	2018	Специальный грузовой автомобиль
М708НУ	Freedom	L3	Datsun	t	1917	Сочлененный автобус
Х709КВ	Skill	L2	Kamaz	t	1912	Автобус общего назначения
Н934УМ	Skill	L3	Datsun	t	2019	Прочее
Е710ХН	Map	L5	BMW	f	1921	Специальный грузовой автомобиль
О711ВВ	Union	L5	Datsun	t	2013	Специальный грузовой автомобиль
У712ОС	Road	M1	Kia	f	2006	Автобус общего назначения
Н713ВС	Freedom	L6	Renault	t	1944	Седельный тягач
Х714ВХ	Road	N2	Lada	f	2006	Микроавтобус
Х715ТЕ	Gate	N2	Honda	f	1913	Микроавтобус
У716СО	Union	M1	Nissan	f	1992	Автобус общего назначения
О717ВУ	Union	M3	Honda	f	1975	Автомобиль-тягач
У718ОУ	Editor	L4	Renault	f	1990	Сочлененный автобус
В719ВА	Fortune	L5	Lexus	t	1940	Микроавтобус
А720УХ	Freedom	L4	Volkswagen	f	1990	Специальный автобус
Р721ОУ	Gate	L5	Hyundai	f	1919	Специальный автобус
Х722МХ	Union	M1	Hyundai	f	1916	Седельный тягач
Р723МР	Skill	L2	Nissan	f	1937	Автобус общего назначения
А724ТВ	Editor	L3	Toyota	f	2018	Сочлененный автобус
К725КВ	Union	L6	Datsun	f	1991	Сочлененный автобус
Т726ХУ	Editor	L6	Honda	f	1953	Автомобиль-тягач
У727СУ	Editor	N3	Subaru	t	1941	Прочее
К728СА	Editor	N3	Subaru	f	1930	Специальный грузовой автомобиль
Е729ХР	Map	M1	Honda	f	1975	Автобус общего назначения
С730АУ	Union	L5	Ford	t	1935	Микроавтобус
Н731КВ	Rio	L7	Datsun	f	1997	Специальный грузовой автомобиль
А732ВТ	Fortune	L7	Daihatsu	t	2013	Специальный автобус
Е733ВС	Assistance	L6	Audi	f	1987	Специальный грузовой автомобиль
Н734ВУ	Gate	L5	Kia	f	1950	Сочлененный автобус
Е735АС	Gate	L5	Kamaz	t	1997	Микроавтобус
Х736ОВ	Gate	L4	Renault	t	1972	Автобус общего назначения
Т737МО	Editor	L7	Renault	f	1906	Грузовой автомобиль общего назначения
Е738МО	Fortune	L6	Volkswagen	f	1910	
Н739АВ	Skill	L6	Nissan	f	2010	Специальный легковой автомобиль
С740ВУ	Fortune	L7	Lada	t	1992	Микроавтобус
Х741МК	Editor	L7	Mitsubishi	f	1910	Сочлененный автобус
У742ВХ	Fortune	L2	Subaru	f	1928	Автобус общего назначения
С743ТТ	Editor	M3	Honda	t	1997	Седельный тягач
Т744ЕХ	Editor	L7	Mitsubishi	f	1946	Автобус общего назначения
Н745АК	Union	M3	Lada	t	1967	Специальный автобус
А746ТН	Assistance	M1	Lada	f	1913	Специальный грузовой автомобиль
Х747ЕР	Map	N1	Renault	t	1953	Прочее
Н748ХА	Skill	L4	Mitsubishi	t	1935	Специальный грузовой автомобиль
Р749АЕ	Rio	L3	BMW	f	1998	Специальный легковой автомобиль
В750СО	Skill	M3	Lada	f	1963	Прочее
У751НЕ	Gate	N1	BMW	f	1983	Грузовой автомобиль общего назначения
Н752ТА	Assistance	N3	Mitsubishi	t	1934	Автомобиль-тягач
К753ХВ	Map	N1	Skoda	t	1951	Легковой автомобиль общего назначения
Р754ОМ	Assistance	L1	Subaru	f	1953	Специальный грузовой автомобиль
В755ЕВ	Union	N1	Renault	f	1953	Автобус общего назначения
Х756ЕХ	Assistance	M2	Ford	f	1963	Специальный легковой автомобиль
Х757РУ	Freedom	L2	Kamaz	t	2007	Специальный грузовой автомобиль
Н758УА	Rio	L4	Toyota	t	1902	Специальный грузовой автомобиль
С759ВУ	Editor	L4	Mitsubishi	f	1966	Грузопассажирский автомобиль
К760УВ	Union	L5	Kia	t	1944	Грузопассажирский автомобиль
К761НН	Fortune	M1	Subaru	f	2020	Автобус общего назначения
Н762ТУ	Gate	M1	Mitsubishi	f	1994	Грузовой автомобиль общего назначения
В763ОК	Fortune	L1	Honda	f	1972	Специальный легковой автомобиль
О764АЕ	Fortune	L4	Lada	f	1924	Специальный грузовой автомобиль
С765КН	Gate	L3	Audi	t	1919	Седельный тягач
С766РУ	Assistance	L1	Hyundai	f	2001	Автомобиль-тягач
Е767ТТ	Union	L6	Kia	t	2002	Легковой автомобиль общего назначения
Н768РН	Fortune	N2	Datsun	t	1946	Автомобиль-тягач
Н769ТН	Map	L6	Renault	f	1909	
Х770НТ	Rio	N2	Datsun	f	1959	Прочее
Н771ВК	Rio	L1	Lada	f	1987	Специальный автобус
Е772НХ	Map	L7	Honda	f	1958	Седельный тягач
А773СВ	Rio	L6	Skoda	t	1924	Грузопассажирский автомобиль
О774РО	Union	M3	Audi	f	2002	Грузовой автомобиль общего назначения
К775РУ	Freedom	M2	Kia	t	1965	Прочее
Е776СМ	Editor	M1	Subaru	t	1967	Седельный тягач
К777ЕТ	Gate	L2	Volkswagen	t	1982	Специальный автобус
О778РМ	Gate	L1	Honda	t	1946	
А779СС	Rio	L5	Datsun	t	2022	Микроавтобус
М780ХА	Union	L3	Daihatsu	t	1969	Автомобиль-тягач
Т781КВ	Road	L4	Renault	f	1962	Легковой автомобиль общего назначения
А782ХС	Road	N2	Subaru	f	1986	Сочлененный автобус
Е783ВУ	Editor	L1	Kamaz	t	1924	Прочее
Р784АТ	Editor	L7	Mitsubishi	f	1940	Микроавтобус
С785НО	Gate	L5	Lada	t	1946	Специальный легковой автомобиль
Т786РХ	Union	L1	Volkswagen	f	1965	Специальный грузовой автомобиль
Р787ХН	Assistance	M3	Skoda	t	1967	Седельный тягач
О788ОВ	Freedom	L7	Renault	f	2017	Сочлененный автобус
У789РТ	Assistance	L6	Ford	f	1958	Специальный грузовой автомобиль
Е790МТ	Gate	L4	Skoda	f	1987	Автомобиль-тягач
О791ТН	Rio	L6	Honda	f	1986	Специальный автобус
М792ВХ	Gate	N3	Hyundai	t	1909	Микроавтобус
М793МР	Fortune	L4	Renault	t	1984	Автомобиль-тягач
С794ЕУ	Skill	M1	Lexus	f	2004	Сочлененный автобус
О795НС	Road	L6	Kia	t	1976	Легковой автомобиль общего назначения
Е796ОР	Rio	L6	Mitsubishi	t	1927	Легковой автомобиль общего назначения
Х797МН	Skill	L4	Renault	t	1965	Специальный автобус
В798СУ	Union	N1	Kamaz	t	1992	Прочее
К799АО	Gate	L2	Datsun	f	1999	Специальный легковой автомобиль
У800ВР	Road	N1	Kia	t	1937	Сочлененный автобус
Х801СН	Freedom	M1	Daihatsu	f	1988	Специальный автобус
У802РН	Editor	N2	Toyota	t	2004	Микроавтобус
Р803КА	Freedom	M2	Mitsubishi	f	2021	Автобус общего назначения
Х804НЕ	Editor	L2	Nissan	f	2015	Микроавтобус
Т805ОЕ	Assistance	M2	Lexus	f	1950	Сочлененный автобус
В806ВЕ	Rio	N1	Lada	t	1968	Автомобиль-тягач
К807АС	Editor	L3	Lexus	f	1915	Автомобиль-тягач
К808АС	Map	L6	Renault	f	1908	Легковой автомобиль общего назначения
Т809МС	Skill	N1	Mitsubishi	t	1983	Грузопассажирский автомобиль
С810СТ	Assistance	L7	BMW	t	1912	Грузовой автомобиль общего назначения
К811УН	Rio	L1	Mitsubishi	f	2008	Автобус общего назначения
У812МС	Editor	N1	Subaru	f	2013	Седельный тягач
В813ЕН	Skill	L2	Honda	f	1954	Автомобиль-тягач
М814ХК	Rio	N1	Skoda	f	1990	Прочее
К815КТ	Skill	N1	Skoda	f	2001	Специальный легковой автомобиль
С816ОА	Assistance	L3	Lexus	t	1906	Специальный грузовой автомобиль
С817РТ	Fortune	N3	Audi	f	1910	Специальный автобус
С818КТ	Road	M3	Toyota	f	1979	Специальный легковой автомобиль
Е819ХН	Freedom	M2	Kamaz	f	1983	Седельный тягач
Н820РК	Skill	L5	BMW	f	1933	Автобус общего назначения
С821АН	Map	L1	Nissan	f	1905	Прочее
Т822РН	Fortune	M3	Mitsubishi	t	1912	Специальный легковой автомобиль
О823ОХ	Editor	M3	Audi	t	1992	Автомобиль-тягач
О824АУ	Assistance	N2	Volkswagen	f	1908	
А825ТМ	Assistance	M1	Mitsubishi	f	1974	Седельный тягач
Е826КВ	Map	L3	Mitsubishi	f	1970	Грузопассажирский автомобиль
В827ОК	Road	M2	Mitsubishi	f	1909	Грузовой автомобиль общего назначения
Х828ХО	Skill	M2	Mitsubishi	f	1948	Автомобиль-тягач
В829ЕУ	Map	N1	Lada	t	1927	Микроавтобус
Н830ВК	Skill	N3	Hyundai	f	1942	
Р831ХР	Freedom	N1	Toyota	f	1926	Специальный грузовой автомобиль
Н832МЕ	Map	L2	Mitsubishi	t	1932	Легковой автомобиль общего назначения
К833УН	Road	M3	Kamaz	f	1903	Специальный автобус
Т834КЕ	Assistance	L6	Toyota	t	1994	Седельный тягач
Р835ХТ	Skill	N3	Lada	f	1935	Специальный легковой автомобиль
О836ВХ	Union	L1	Datsun	t	1984	Грузопассажирский автомобиль
М837РУ	Freedom	L1	Subaru	t	1972	Грузовой автомобиль общего назначения
Н838ХК	Editor	L6	Volkswagen	t	1935	Легковой автомобиль общего назначения
М839УМ	Freedom	L2	Nissan	f	2020	Автомобиль-тягач
К840РН	Editor	M1	Datsun	f	2004	Автомобиль-тягач
Е841ТВ	Freedom	L6	Kia	t	2016	Грузопассажирский автомобиль
У842КХ	Rio	L1	Honda	t	1962	Седельный тягач
Р843ВК	Editor	N1	Lada	f	2020	Седельный тягач
Р844УУ	Rio	M2	Lada	f	2004	Специальный грузовой автомобиль
К845АН	Map	L7	Lexus	t	1958	Прочее
Н846АТ	Editor	M3	Lexus	f	1964	Легковой автомобиль общего назначения
К847СК	Rio	L6	Ford	f	1933	Специальный легковой автомобиль
Т848АР	Fortune	N3	Mitsubishi	t	1911	Сочлененный автобус
О849УС	Map	M1	Mitsubishi	t	1950	Автомобиль-тягач
М850АВ	Skill	L1	Datsun	t	2007	Грузопассажирский автомобиль
В851ХО	Assistance	L4	Ford	f	1938	Легковой автомобиль общего назначения
Т852УМ	Assistance	L5	Datsun	t	1983	Грузопассажирский автомобиль
А853ОЕ	Gate	L5	Toyota	t	1931	Сочлененный автобус
О854НС	Assistance	L1	Subaru	f	1903	Легковой автомобиль общего назначения
Т855ХН	Map	L7	BMW	f	1900	Автобус общего назначения
А856АМ	Gate	N3	Daihatsu	f	1986	Автомобиль-тягач
А857КТ	Union	L2	Mitsubishi	f	1940	Специальный автобус
Е858ЕМ	Fortune	M3	Subaru	f	1958	Грузовой автомобиль общего назначения
Е859УР	Fortune	M1	Volkswagen	t	1991	Сочлененный автобус
Е860ХН	Union	L3	BMW	t	1938	Прочее
А861НН	Assistance	M1	Hyundai	t	1974	Грузовой автомобиль общего назначения
А862МХ	Skill	N2	Ford	t	1942	Автомобиль-тягач
Х863АТ	Road	L1	Daihatsu	t	1940	Специальный автобус
В864ВО	Freedom	L6	Renault	f	1906	Сочлененный автобус
У865ЕХ	Rio	M3	Nissan	t	1975	
С866МХ	Fortune	N2	Ford	f	1938	Микроавтобус
К867ВА	Rio	L1	BMW	f	2009	
М868ВУ	Editor	M2	Honda	f	1910	Специальный легковой автомобиль
К869КТ	Freedom	M1	BMW	f	1926	Автобус общего назначения
А870ВН	Freedom	L2	Mitsubishi	t	1920	Специальный автобус
Р871УВ	Editor	N3	Toyota	t	1953	Специальный грузовой автомобиль
Е872МО	Skill	L7	Honda	f	1938	Микроавтобус
К873НР	Assistance	L2	Kamaz	f	1954	
В874НК	Fortune	N3	Nissan	t	2011	Специальный автобус
У875СС	Skill	L6	Lexus	f	1930	Специальный автобус
М876НР	Road	L7	Volkswagen	t	1919	Автомобиль-тягач
К877УВ	Rio	L4	Datsun	t	1935	Специальный грузовой автомобиль
К878УВ	Union	L1	Hyundai	t	1925	
В879ВЕ	Skill	N1	BMW	f	1993	Грузопассажирский автомобиль
О880НЕ	Gate	M3	BMW	t	1938	Седельный тягач
М881СТ	Skill	L5	Renault	f	2009	Прочее
Н882МС	Rio	L2	Toyota	f	2002	Грузопассажирский автомобиль
О883КА	Skill	M2	Hyundai	t	1910	Легковой автомобиль общего назначения
У884ХЕ	Fortune	L7	Datsun	t	1994	Седельный тягач
С885НМ	Editor	N2	Hyundai	f	1930	Специальный легковой автомобиль
А886ВЕ	Rio	L4	Mazda	f	1966	Грузопассажирский автомобиль
М887СХ	Union	N2	Lexus	f	1961	Прочее
А888МК	Union	L7	BMW	f	1937	Специальный легковой автомобиль
Е889КО	Map	M3	Skoda	f	2005	Автомобиль-тягач
С890ТО	Freedom	L6	Kia	t	1996	Сочлененный автобус
Т891РО	Assistance	M1	Daihatsu	f	2011	Специальный легковой автомобиль
О892УВ	Union	L1	Lada	t	2011	Автомобиль-тягач
У893КК	Union	L6	Datsun	f	1963	Легковой автомобиль общего назначения
О894УС	Skill	L7	Mazda	f	1974	Специальный автобус
С895ТМ	Rio	L7	Subaru	f	1908	Легковой автомобиль общего назначения
С896КК	Freedom	N3	Ford	t	1936	Легковой автомобиль общего назначения
С897НМ	Road	N1	Lexus	t	2015	Специальный легковой автомобиль
Н898СТ	Skill	L6	Daihatsu	f	1923	Специальный автобус
Т899КУ	Freedom	L1	Renault	t	1909	Специальный грузовой автомобиль
С900АК	Skill	L2	Audi	t	1984	Сочлененный автобус
А901ВХ	Gate	L5	Kamaz	t	1991	Микроавтобус
Р902ХМ	Road	L2	Kamaz	t	1953	Сочлененный автобус
К903НМ	Map	M3	Toyota	f	2015	Седельный тягач
А904СС	Map	M3	Skoda	f	1901	Специальный автобус
Р905ВХ	Freedom	L5	Honda	t	1968	Легковой автомобиль общего назначения
А906УМ	Rio	L5	Kamaz	f	1950	Микроавтобус
В907ТТ	Fortune	L2	Subaru	f	1954	Легковой автомобиль общего назначения
Н908ТЕ	Map	M2	Audi	t	1940	Специальный легковой автомобиль
С909АТ	Gate	L5	Subaru	t	1920	Автобус общего назначения
Т910ЕК	Fortune	M1	Mitsubishi	t	1997	Прочее
Т911ММ	Map	L6	Daihatsu	f	1991	Микроавтобус
М912УХ	Skill	L2	Lexus	t	2017	Микроавтобус
О913КМ	Assistance	L6	Hyundai	t	2015	Автомобиль-тягач
М914КО	Assistance	N2	Skoda	t	1918	Грузопассажирский автомобиль
О915ОК	Freedom	L7	Nissan	t	1943	Грузопассажирский автомобиль
К916РР	Editor	L1	Hyundai	t	2008	Грузопассажирский автомобиль
У917НМ	Skill	N2	Daihatsu	t	1948	Грузопассажирский автомобиль
М918РК	Fortune	N1	Nissan	t	1947	Легковой автомобиль общего назначения
Е919ВС	Map	M2	Ford	t	1937	Прочее
В920АЕ	Road	N1	Mitsubishi	t	1984	Автомобиль-тягач
Е921РУ	Union	M1	Lada	f	1980	Автобус общего назначения
Т922МА	Skill	L5	BMW	t	1995	Легковой автомобиль общего назначения
Н923НЕ	Fortune	M2	Subaru	f	1985	Автобус общего назначения
С924МН	Assistance	M2	Lada	f	1911	Специальный легковой автомобиль
М925ОК	Fortune	L2	Subaru	t	1973	Грузовой автомобиль общего назначения
О926СС	Union	L2	Daihatsu	t	1914	Микроавтобус
В927КО	Gate	L6	Mazda	t	1900	Сочлененный автобус
В928ХУ	Assistance	M3	Subaru	t	1931	Грузопассажирский автомобиль
А929ВК	Union	M1	Nissan	t	1924	Специальный легковой автомобиль
Е930ВК	Editor	L2	Datsun	t	1955	Специальный автобус
В931АХ	Map	N3	Renault	t	1923	Специальный легковой автомобиль
Х932СВ	Union	N2	Kia	f	2013	Грузопассажирский автомобиль
А935НА	Rio	M3	Kamaz	t	2016	Микроавтобус
В936УН	Fortune	N3	Subaru	t	1915	Автомобиль-тягач
Х937РН	Map	L7	Datsun	t	2014	Специальный грузовой автомобиль
К938ЕХ	Rio	M3	Lada	f	1915	Специальный автобус
Р939АН	Assistance	L2	Toyota	f	1927	Легковой автомобиль общего назначения
В940НВ	Rio	L2	Renault	f	2005	Специальный автобус
А941ОЕ	Assistance	M2	Daihatsu	f	1939	Легковой автомобиль общего назначения
А942КР	Road	L3	Honda	f	1957	Прочее
С943РН	Map	M3	Lada	f	2010	Микроавтобус
В944ОМ	Fortune	L5	Honda	f	1988	Автобус общего назначения
С945КР	Union	L6	Daihatsu	f	1912	Автомобиль-тягач
С946УО	Skill	M2	Subaru	f	1918	Прочее
М947НХ	Rio	N2	Skoda	t	1966	Седельный тягач
М948РХ	Editor	L3	Nissan	t	1904	Легковой автомобиль общего назначения
Р949ТА	Freedom	L7	Datsun	f	1964	Грузопассажирский автомобиль
У950КХ	Freedom	N3	Kamaz	t	2002	
Х951ЕС	Editor	L6	Volkswagen	f	1939	Грузопассажирский автомобиль
Р952НТ	Rio	L4	Datsun	t	1969	Автомобиль-тягач
О953НО	Map	L7	Datsun	t	1975	Сочлененный автобус
М954ТВ	Union	L5	Hyundai	t	2003	Сочлененный автобус
Р955РС	Editor	L1	BMW	f	1927	Автомобиль-тягач
М956АО	Map	M1	Renault	t	1966	Грузовой автомобиль общего назначения
У957РТ	Freedom	M1	Toyota	t	1926	Легковой автомобиль общего назначения
Н958ТС	Fortune	L4	Ford	t	1978	Легковой автомобиль общего назначения
Н959ХУ	Gate	N3	Renault	t	1991	Грузовой автомобиль общего назначения
А960АУ	Map	L3	Mazda	f	2014	
О961АЕ	Freedom	M3	Audi	f	1997	
У962ХО	Freedom	M1	Kamaz	f	2008	
В963УР	Map	L3	Lexus	f	1978	Сочлененный автобус
С964РУ	Union	N3	Renault	f	1909	Сочлененный автобус
Р965КТ	Freedom	N2	Audi	t	1925	Специальный легковой автомобиль
М966ТВ	Editor	N1	Nissan	t	1927	Грузопассажирский автомобиль
Е967КТ	Rio	M2	Mazda	t	2002	Сочлененный автобус
Т968КМ	Rio	L2	Hyundai	t	1970	Грузовой автомобиль общего назначения
Е969НТ	Gate	M2	Kamaz	t	1928	Специальный автобус
Р970АА	Gate	N3	Kia	t	1949	Легковой автомобиль общего назначения
В971УО	Gate	L6	Mazda	t	2017	Грузопассажирский автомобиль
В972КЕ	Assistance	N3	Mitsubishi	f	1914	Седельный тягач
О973ХО	Freedom	L4	Mazda	t	1943	Специальный автобус
А974НН	Skill	L1	Volkswagen	f	1902	Сочлененный автобус
С975СС	Assistance	L1	Volkswagen	t	1950	Специальный автобус
Е976ТС	Rio	N1	Lada	t	2021	Микроавтобус
К977ЕР	Rio	N3	Lada	f	1954	Сочлененный автобус
Т978НА	Fortune	L1	Kia	f	1918	Специальный грузовой автомобиль
У979ХА	Assistance	N3	Renault	t	1954	
Е980ЕА	Freedom	N1	Renault	f	1944	Автобус общего назначения
К981ОУ	Road	L6	Audi	t	1933	Грузовой автомобиль общего назначения
Е982ТЕ	Skill	N2	Kia	t	2014	Автобус общего назначения
К983ЕХ	Skill	N2	Daihatsu	f	1963	Микроавтобус
О984УН	Rio	N2	Kamaz	f	1968	Грузовой автомобиль общего назначения
В985НУ	Rio	M2	Volkswagen	t	1953	Микроавтобус
Н986ОН	Gate	L3	Skoda	f	1943	Микроавтобус
Е987ОН	Rio	L2	Mitsubishi	f	1917	Микроавтобус
В988АВ	Fortune	L2	Mazda	t	2005	Специальный легковой автомобиль
М989УВ	Rio	L2	Kamaz	f	1998	
Р990ВТ	Union	L1	Renault	f	1915	Специальный легковой автомобиль
Е991АТ	Fortune	M2	Kamaz	f	2006	Грузовой автомобиль общего назначения
Н992ХК	Freedom	N3	Audi	f	1992	
Х993НУ	Fortune	L2	Skoda	t	2015	
В994РТ	Road	L7	Nissan	t	1986	Седельный тягач
К995ТО	Skill	M1	BMW	t	1930	
А996КМ	Union	L7	Mitsubishi	f	1952	Микроавтобус
Е997УВ	Union	N1	Subaru	t	1904	Автомобиль-тягач
Е998КХ	Rio	L5	Mazda	f	1947	Прочее
\.


--
-- TOC entry 3164 (class 2606 OID 16428)
-- Name: transport transport_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transport
    ADD CONSTRAINT transport_pkey PRIMARY KEY (transport_carnumber);


-- Completed on 2022-03-19 11:32:13

--
-- PostgreSQL database dump complete
--

--
-- Database "postgres" dump
--

\connect postgres

--
-- PostgreSQL database dump
--

-- Dumped from database version 14.2
-- Dumped by pg_dump version 14.2

-- Started on 2022-03-19 11:32:14

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 3304 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


-- Completed on 2022-03-19 11:32:14

--
-- PostgreSQL database dump complete
--

-- Completed on 2022-03-19 11:32:14

--
-- PostgreSQL database cluster dump complete
--

