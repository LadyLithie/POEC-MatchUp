INSERT INTO candidate VALUES (null,'DRAGNIR','Natsu',0987654321,NOW(),'1 rue de la liberté','natsu.dragnir@orange.fr',null,'Bonjour je suis natsu DRAGNIR ','Nat','pwd','candidate');
INSERT INTO candidate VALUES (null,'NEYMAR','Jean',1234567890,NOW(),'1 rue de PSG', 'jean.neymar@orange.fr',null,'Bonjour je vaux 222 millions €', 'Jean', 'foot','candidate' );

INSERT INTO enterprise VALUES (null,'QUATAR',0102030405, '1 rue du quatar','PARIS','lesrichesduMoyenOrient.com','lesrichesduMoyenOrient@pretentieux.com','Bonjour je possede une carte bleue non je voulais dire une carte dieu',null,'lesrichesduMoyenOrient@twitter.com','lesrichesduMoyenOrient@linkedin.com','Recherche de footballeur sans le bac','enterprise','dieuxDuFoot','petrole');
INSERT INTO enterprise VALUES (null,'FAIRYTAIL',0607080910, '1 rue de Magnolia','MAGNOLIA','fairytail.com','fairytail@pauvre.com','Bonjour je suis une guilde',null,'fairytail@twitter.com','fairytail@linkedin.com','Recherche de mage funs','enterprise','makarof','fee');
INSERT INTO enterprise VALUES (null,'SCIENCEINFUSE',9874561236, '1 rue du savoir','RENNES','lascienceinfuse.com','lascienceinfuse@pretentieux.com','Je sais tout',null,'lascienceinfuse@twitter.com','lascienceinfuse@linkedin.com','Recherche de savoir être ','enterprise','Eisnstein','prof');
INSERT INTO enterprise VALUES (null,'ONEPIECE',8569741252, '1 rue de Redline','FUSCHIA','lespiratesdunouveaumonde.com','lespiratesdunouveaumonde@pirate.com','Bonjour je suis le roi des pirates',null,'lespiratesdunouveaumonde@twitter.com','lespiratesdunouveaumonde@linkedin.com','Recherche de pirate','enterprise','chapeauDePaille','luffy');
INSERT INTO enterprise VALUES (null,'LOL',4578129632, '1 rue de riot games','LOS ANGELES','gamers.com','gamers@nolife.com','Bonjour je recherche des developpers/gamers',null,'gamers@twitter.com','gamers@linkedin.com','Recherche de joueurs très mauvais','enterprise','allstar','nexus');
INSERT INTO enterprise VALUES (null,'TROLL',4525658579, '1 rue du cest pas ici','TROLLCITY','.com','cestpasici@vienspas.com','Bonjour je ne recherche pas des trolls cest faux',null,'cestpasici@twitter.com','cestpasici@linkedin.com','Recheche personne ','enterprise','carleric','non');
INSERT INTO skill VALUES (null,'JAVA','Langage');
INSERT INTO skill VALUES (null,'SQL','Langage');
INSERT INTO skill VALUES (null,'C','Langage');
INSERT INTO skill VALUES (null,'C++','Langage');
INSERT INTO skill VALUES (null,'Python','Langage');
INSERT INTO skill VALUES (null,'HTML','Langage');
INSERT INTO skill VALUES (null,'CSS','Langage');
INSERT INTO skill VALUES (null,'Javascript','Langage');
INSERT INTO skill VALUES (null,'Eclipse','Logiciel');
INSERT INTO skill VALUES (null,'StarUML','Logiciel');
INSERT INTO skill VALUES (null,'Git Bash','Logiciel');
INSERT INTO contract_type VALUES (null,'CDD');
INSERT INTO contract_type VALUES (null,'CDI');
INSERT INTO contract_type VALUES (null,'ALTERNANCE');
INSERT INTO contract_type VALUES (null,'CONTRAT DE PROFESSIONALISATION');
INSERT INTO contract_type VALUES (null,'INTERIM');

INSERT INTO job VALUES (null,'Développeur',' ','Recherche un développeur java',2,5,null);
INSERT INTO job VALUES (null,'Mage',' ','Recherche un mage de feu',5,null,null);
INSERT INTO job VALUES (null,'Footballeur',' ','Recherche un footballeur qui ne possede pas le bac et qui de preference ne sais pas écrire',3,null,null);
INSERT INTO job VALUES (null,'Prof',' ','Recherche un prof qui a la science infuse',1,null,null);
INSERT INTO job VALUES (null,'Pirate',' ','Recherche un pirate sympa et riche',4,null,null);
INSERT INTO job VALUES (null,'Développeur/gamer',' ','Recherche un développeur qui joue à league of legend et qui rage jamais',3,null,null);
INSERT INTO job VALUES (null,'Troll',' ','On vous prendra pas, pas la peine de postuler',2,null,null);

INSERT INTO administrator VALUES (null,'leboss','dujava','lebossdujava@orange.fr','7845126398','admin','admin','admin');

INSERT INTO headhunter Values (null,'Markides','Sacha','1245789656','sacha.markides@orange.fr',null,'sacha.markides@twitter.fr','sacha.markides@linkedin.fr','bonjour je suis un headhunter','root','root','headhunter');
INSERT INTO headhunter Values (null,'Izzar','Yannick','0680913289','yannick.izzar@orange.fr',null,'yannick.izzar@twitter.fr','yannick.izzar@linkedin.fr','bonjour je suis un yannick','nouk','pwd','headhunter');

INSERT INTO city VALUES (null,'Paris','75000');
INSERT INTO city VALUES (null,'Lyon','69000');
INSERT INTO city VALUES (null,'Marseille','13000');
INSERT INTO city VALUES (null,'Lille','59000');
INSERT INTO city VALUES (null,'Rennes','35000');
INSERT INTO city VALUES (null,'Nantes','44000');
INSERT INTO city VALUES (null,'Bordeaux','33000');
INSERT INTO city VALUES (null,'Toulouse','64000');

INSERT INTO headhunter_enterprise VALUES (1, 1);
INSERT INTO headhunter_enterprise VALUES (1, 2);