--
-- PostgreSQL database dump
--

-- Dumped from database version 12.1
-- Dumped by pg_dump version 12.1

-- Started on 2020-01-30 12:04:39

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
-- TOC entry 207 (class 1259 OID 17065)
-- Name: crew; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.crew (
    crew_id integer NOT NULL,
    lead_role character varying NOT NULL,
    others character varying NOT NULL
);


ALTER TABLE public.crew OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 17063)
-- Name: crew_crew_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.crew_crew_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.crew_crew_id_seq OWNER TO postgres;

--
-- TOC entry 2872 (class 0 OID 0)
-- Dependencies: 206
-- Name: crew_crew_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.crew_crew_id_seq OWNED BY public.crew.crew_id;


--
-- TOC entry 209 (class 1259 OID 17132)
-- Name: films; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.films (
    film_id integer NOT NULL,
    name character varying NOT NULL,
    description character varying NOT NULL
);


ALTER TABLE public.films OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 17130)
-- Name: films_film_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.films_film_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.films_film_id_seq OWNER TO postgres;

--
-- TOC entry 2873 (class 0 OID 0)
-- Dependencies: 208
-- Name: films_film_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.films_film_id_seq OWNED BY public.films.film_id;


--
-- TOC entry 205 (class 1259 OID 17026)
-- Name: language; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.language (
    lang_id integer NOT NULL,
    language character varying NOT NULL
);


ALTER TABLE public.language OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 17024)
-- Name: language_lang_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.language_lang_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.language_lang_id_seq OWNER TO postgres;

--
-- TOC entry 2874 (class 0 OID 0)
-- Dependencies: 204
-- Name: language_lang_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.language_lang_id_seq OWNED BY public.language.lang_id;


--
-- TOC entry 211 (class 1259 OID 17144)
-- Name: movie_ref; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.movie_ref (
    id integer NOT NULL,
    cr_id integer NOT NULL,
    fi_id integer NOT NULL,
    la_id integer NOT NULL,
    ra_id integer NOT NULL
);


ALTER TABLE public.movie_ref OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 17142)
-- Name: movie_ref_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.movie_ref_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.movie_ref_id_seq OWNER TO postgres;

--
-- TOC entry 2875 (class 0 OID 0)
-- Dependencies: 210
-- Name: movie_ref_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.movie_ref_id_seq OWNED BY public.movie_ref.id;


--
-- TOC entry 203 (class 1259 OID 17018)
-- Name: ratings; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ratings (
    rating_id integer NOT NULL,
    rating integer NOT NULL
);


ALTER TABLE public.ratings OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 17016)
-- Name: ratings_rating_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.ratings_rating_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.ratings_rating_id_seq OWNER TO postgres;

--
-- TOC entry 2876 (class 0 OID 0)
-- Dependencies: 202
-- Name: ratings_rating_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.ratings_rating_id_seq OWNED BY public.ratings.rating_id;


--
-- TOC entry 2716 (class 2604 OID 17068)
-- Name: crew crew_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.crew ALTER COLUMN crew_id SET DEFAULT nextval('public.crew_crew_id_seq'::regclass);


--
-- TOC entry 2717 (class 2604 OID 17135)
-- Name: films film_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.films ALTER COLUMN film_id SET DEFAULT nextval('public.films_film_id_seq'::regclass);


--
-- TOC entry 2715 (class 2604 OID 17029)
-- Name: language lang_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.language ALTER COLUMN lang_id SET DEFAULT nextval('public.language_lang_id_seq'::regclass);


--
-- TOC entry 2718 (class 2604 OID 17147)
-- Name: movie_ref id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movie_ref ALTER COLUMN id SET DEFAULT nextval('public.movie_ref_id_seq'::regclass);


--
-- TOC entry 2714 (class 2604 OID 17021)
-- Name: ratings rating_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ratings ALTER COLUMN rating_id SET DEFAULT nextval('public.ratings_rating_id_seq'::regclass);


--
-- TOC entry 2862 (class 0 OID 17065)
-- Dependencies: 207
-- Data for Name: crew; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.crew (crew_id, lead_role, others) FROM stdin;
1	vijay Sthupathi	samantha,fahadh faasil
2	shane nigam	fahadh faasil
3	ranveer	alia
4	leonardo dicaprio	morgot robbie,brad pitt
5	joaquin phonix	robert de niro
6	Al pacino	robert de niro
\.


--
-- TOC entry 2864 (class 0 OID 17132)
-- Dependencies: 209
-- Data for Name: films; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.films (film_id, name, description) FROM stdin;
\.


--
-- TOC entry 2860 (class 0 OID 17026)
-- Dependencies: 205
-- Data for Name: language; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.language (lang_id, language) FROM stdin;
1	tamil
2	english
3	malayalam
4	hindi
5	telugu
\.


--
-- TOC entry 2866 (class 0 OID 17144)
-- Dependencies: 211
-- Data for Name: movie_ref; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.movie_ref (id, cr_id, fi_id, la_id, ra_id) FROM stdin;
\.


--
-- TOC entry 2858 (class 0 OID 17018)
-- Dependencies: 203
-- Data for Name: ratings; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.ratings (rating_id, rating) FROM stdin;
1	1
2	2
3	3
4	4
5	5
\.


--
-- TOC entry 2877 (class 0 OID 0)
-- Dependencies: 206
-- Name: crew_crew_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.crew_crew_id_seq', 6, true);


--
-- TOC entry 2878 (class 0 OID 0)
-- Dependencies: 208
-- Name: films_film_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.films_film_id_seq', 1, false);


--
-- TOC entry 2879 (class 0 OID 0)
-- Dependencies: 204
-- Name: language_lang_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.language_lang_id_seq', 5, true);


--
-- TOC entry 2880 (class 0 OID 0)
-- Dependencies: 210
-- Name: movie_ref_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.movie_ref_id_seq', 1, false);


--
-- TOC entry 2881 (class 0 OID 0)
-- Dependencies: 202
-- Name: ratings_rating_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.ratings_rating_id_seq', 5, true);


--
-- TOC entry 2724 (class 2606 OID 17073)
-- Name: crew crew_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.crew
    ADD CONSTRAINT crew_pkey PRIMARY KEY (crew_id);


--
-- TOC entry 2726 (class 2606 OID 17140)
-- Name: films films_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.films
    ADD CONSTRAINT films_pkey PRIMARY KEY (film_id);


--
-- TOC entry 2722 (class 2606 OID 17034)
-- Name: language language_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.language
    ADD CONSTRAINT language_pkey PRIMARY KEY (lang_id);


--
-- TOC entry 2720 (class 2606 OID 17023)
-- Name: ratings ratings_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ratings
    ADD CONSTRAINT ratings_pkey PRIMARY KEY (rating_id);


--
-- TOC entry 2727 (class 2606 OID 17148)
-- Name: movie_ref cr_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movie_ref
    ADD CONSTRAINT cr_id_fk FOREIGN KEY (cr_id) REFERENCES public.crew(crew_id);


--
-- TOC entry 2728 (class 2606 OID 17153)
-- Name: movie_ref fi_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movie_ref
    ADD CONSTRAINT fi_id_fk FOREIGN KEY (fi_id) REFERENCES public.films(film_id);


--
-- TOC entry 2729 (class 2606 OID 17158)
-- Name: movie_ref la_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movie_ref
    ADD CONSTRAINT la_id_fk FOREIGN KEY (la_id) REFERENCES public.language(lang_id);


--
-- TOC entry 2730 (class 2606 OID 17163)
-- Name: movie_ref ra_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movie_ref
    ADD CONSTRAINT ra_id_fk FOREIGN KEY (ra_id) REFERENCES public.ratings(rating_id);


-- Completed on 2020-01-30 12:04:40

--
-- PostgreSQL database dump complete
--

