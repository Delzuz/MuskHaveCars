
INSERT INTO CAR_SEGMENT (SEGMENT_NAME, DESCRIPTION, PRICE) VALUES ('Budget', 'The affordable choice', 20);
INSERT INTO CAR_SEGMENT (SEGMENT_NAME, DESCRIPTION, PRICE) VALUES ('Mid-range', 'The comfortable choice', 30);
INSERT INTO CAR_SEGMENT (SEGMENT_NAME, DESCRIPTION, PRICE) VALUES ('Premium', 'The luxurious choice', 40);



INSERT INTO CAR (CAR_NAME, DESCRIPTION, RANGE, CAR_SEGMENT_ID) VALUES ('Toyota BZ4X', 'The BZ4X doesn''t force you to choose between power and responsible driving. Just take your seat, select a gear and enjoy the comfort.', 460, 2);
INSERT INTO CAR (CAR_NAME, DESCRIPTION, RANGE, CAR_SEGMENT_ID) VALUES ('Nissan Leaf', 'The Nissan Leaf stylized as LEAF, is a compact five-door hatchback battery electric vehicle (BEV) manufactured by Nissan. Models with an on-board 3.6 kW charger can be fully charged in eight hours from an appropriate 240-volt charger', 320, 1);
INSERT INTO CAR (CAR_NAME, DESCRIPTION, RANGE, CAR_SEGMENT_ID) VALUES ('Polestar 3', 'Polestar 3 is an advanced electric car that comes in standard and long-range versions. A fully electric fastback that redefines design and performance.', 450, 2);
INSERT INTO CAR (CAR_NAME, DESCRIPTION, RANGE, CAR_SEGMENT_ID) VALUES ('Renault Zoe', 'The Renault Zoe (stylized as ZOE and pronounced as "Zoey"), known as Renault Zoe E-Tech Electric since 2021, is a five-door supermini electric car produced by the French manufacturer Renault.', 280, 1);
INSERT INTO CAR (CAR_NAME, DESCRIPTION, RANGE, CAR_SEGMENT_ID) VALUES ('Tesla Model S', 'Model S is built from the ground up as an electric vehicle, with a high-strength architecture and floor-mounted battery pack for incredible occupant protection and low rollover risk.', 510, 3);
INSERT INTO CAR (CAR_NAME, DESCRIPTION, RANGE, CAR_SEGMENT_ID) VALUES ('Cybertruck', 'Cybertruck is built with an exterior shell made for ultimate durability and passenger protection.', 800, 3);

INSERT INTO GEO_LOCATION (CITY_NAME) VALUES ('Malmö');
INSERT INTO GEO_LOCATION (CITY_NAME) VALUES ('Stockholm');
INSERT INTO GEO_LOCATION (CITY_NAME) VALUES ('Göteborg');
INSERT INTO GEO_LOCATION (CITY_NAME) VALUES ('Växjö');

INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (5, 1, 1);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (4, 2, 1);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (3, 3, 1);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (6, 4, 1);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (7, 5, 1);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (4, 6, 1);

INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (4, 1, 2);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (2, 2, 2);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (3, 3, 2);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (0, 5, 2);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (0, 6, 2);

INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (0, 1, 3);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (2, 2, 3);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (4, 3, 3);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (1, 4, 3);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (0, 6, 3);

INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (5, 1, 4);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (4, 2, 4);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (3, 3, 4);
INSERT INTO CAR_LOCATION (QUANTITY, CAR_ID, GEO_LOCATION_ID) VALUES (6, 4, 4);
