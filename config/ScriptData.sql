INSERT INTO `administrator` (`id_admin`, `lastname_admin`, `firstname_admin`, `mail_admin`, `phone_admin`, `logo_admin`, `role_admin`, `login_admin`, `password_admin`, `valid`) VALUES
(1, 'leboss', 'dujava', 'lebossdujava@orange.fr', '0845126398', NULL, 'ADMIN', 'admin', 'admin', 'TRUE');

INSERT INTO `candidate` (`id_candidate`, `lastname_candidate`, `firstname_candidate`, `phone_candidate`, `birthday_candidate`, `address_candidate`, `mail_candidate`, `picture_candidate`, `presentation_candidate`, `login_candidate`, `password_candidate`, `role_candidate`, `valid`) VALUES
(1, 'DRAGNIR', 'Natsu', '987654321', '2017-09-09', '1 rue de la liberté', 'natsu.dragnir@orange.fr', NULL, 'Bonjour je suis natsu DRAGNIR ', 'Nat', 'pwd', 'candidate', 'FALSE'),
(2, 'NEYMAR', 'Jean', '1234567890', '2017-09-09', '1 rue de PSG', 'jean.neymar@orange.fr', NULL, 'Bonjour je vaux 222 millions €', 'Jean', 'foot', 'candidate', 'FALSE'),
(3, 'null', 'null', 'null', NULL, 'null', 'blabla@super.tor', 0x6e756c6c, 'null', 'blablator', 'blator', 'CANDIDATE', 'FALSE');

INSERT INTO `candidate_skill` (`candidate_id`, `skill_id`) VALUES
(2, 1),
(2, 2),
(2, 4),
(1, 6),
(1, 7),
(1, 8),
(1, 12),
(3, 12),
(1, 13),
(3, 23),
(1, 26),
(3, 26),
(3, 32),
(2, 33),
(3, 33),
(3, 34),
(2, 44),
(3, 44);

INSERT INTO `contract_type` (`id_contract`, `name_contract`) VALUES
(1, 'CDD'),
(2, 'CDI'),
(3, 'ALTERNANCE'),
(4, 'CONTRAT DE PROFESSIONALISATION'),
(5, 'INTERIM');

INSERT INTO `enterprise` (`id_enterprise`, `name_enterprise`, `phone_enterprise`, `address_enterprise`, `city_enterprise`, `website_enterprise`, `mail_enterprise`, `presentation_enterprise`, `logo_enterprise`, `twitter_enterprise`, `linkedin_enterprise`, `activityfield_enterprise`, `role_enterprise`, `login_enterprise`, `password_enterprise`, `valid`) VALUES
(1, 'QUATAR', '102030405', '1 rue du quatar', 'PARIS', 'lesrichesduMoyenOrient.com', 'lesrichesduMoyenOrient@pretentieux.com', 'Bonjour je possede une carte bleue non je voulais dire une carte dieu', NULL, 'lesrichesduMoyenOrient@twitter.com', 'lesrichesduMoyenOrient@linkedin.com', 'Recherche de footballeur sans le bac', 'enterprise', 'dieuxDuFoot', 'petrole', 'FALSE'),
(2, 'FAIRYTAIL', '607080910', '1 rue de Magnolia', 'MAGNOLIA', 'fairytail.com', 'fairytail@pauvre.com', 'Bonjour je suis une guilde', 0x6e756c6c, 'fairytail@twitter.com', 'fairytail@linkedin.com', 'Recherche de mage funs', 'COMPANY', 'makarof', 'fee', 'TRUE'),
(3, 'SCIENCEINFUSE', '9874561236', '1 rue du savoir', 'RENNES', 'lascienceinfuse.com', 'lascienceinfuse@pretentieux.com', 'Je sais tout', NULL, 'lascienceinfuse@twitter.com', 'lascienceinfuse@linkedin.com', 'Recherche de savoir être ', 'enterprise', 'Eisnstein', 'prof', 'FALSE'),
(4, 'ONEPIECE', '8569741252', '1 rue de Redline', 'FUSCHIA', 'lespiratesdunouveaumonde.com', 'lespiratesdunouveaumonde@pirate.com', 'Bonjour je suis le roi des pirates', NULL, 'lespiratesdunouveaumonde@twitter.com', 'lespiratesdunouveaumonde@linkedin.com', 'Recherche de pirate', 'enterprise', 'chapeauDePaille', 'luffy', 'FALSE'),
(5, 'LOL', '4578129632', '1 rue de riot games', 'LOS ANGELES', 'gamers.com', 'gamers@nolife.com', 'Bonjour je recherche des developpers/gamers', NULL, 'gamers@twitter.com', 'gamers@linkedin.com', 'Recherche de joueurs très mauvais', 'enterprise', 'allstar', 'nexus', 'FALSE'),
(6, 'TROLL', '4525658579', '1 rue du cest pas ici', 'TROLLCITY', '.com', 'cestpasici@vienspas.com', 'Bonjour je ne recherche pas des trolls cest faux', NULL, 'cestpasici@twitter.com', 'cestpasici@linkedin.com', 'Recheche personne ', 'enterprise', 'carleric', 'non', 'FALSE'),
(7, 'null', 'null', 'null', 'null', 'null', 'admin@starforge.inc', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'starforge', 'star', 'FALSE'),
(8, 'The Company', '00000000', 'lololo', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(9, 'The Company', '00000000', 'lololo', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(10, 'The Company', '00000000', 'null', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(11, 'The Company', '00000000', 'lololo', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(12, 'The Company', '00000000', 'null', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(13, 'The Company', '00000000', 'lololo', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(14, 'The Company', '00000000', 'null', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(15, 'The Company', '00000000', 'lololo', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(16, 'The Company', '00000000', 'null', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(17, 'The Company', '00000000', 'lololo', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(18, 'The Company', '00000000', 'null', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(19, 'The Company', '00000000', 'lololo', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE'),
(20, 'The Company', '00000000', 'null', 'null', 'null', 'no email', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'userOne', 'null', 'FALSE');

INSERT INTO `headhunter` (`id_headhunter`, `lastname_headhunter`, `firstname_headhunter`, `phone_headhunter`, `mail_headhunter`, `picture_headhunter`, `twitter_headhunter`, `linkedin_headhunter`, `presentation_headhunter`, `login_headhunter`, `password_headhunter`, `role_headhunter`, `valid`) VALUES
(1, 'Markides', 'Sacha', '1245789656', 'sacha.markides@orange.fr', NULL, 'sacha.markides@twitter.fr', 'sacha.markides@linkedin.fr', 'bonjour je suis un headhunter', 'root', 'root', 'headhunter', 'FALSE'),
(2, 'null', 'null', 'null', 'toto@trololo.fr', 0x6e756c6c, 'null', 'null', 'null', 'totoDeTrololo', 'toto', 'HEADHUNTER', 'FALSE');

INSERT INTO `headhunter_enterprise` (`headhunter_id`, `enterprise_id`) VALUES
(1, 1),
(1, 2);

INSERT INTO `job` (`id_job`, `title_job`, `address`, `presentation_job`, `contract_id`, `enterprise_id`, `headhunter_id`) VALUES
(1, 'Développeur', ':,0,', 'Recherche un développeur java', 2, 5, NULL),
(2, 'Mage', ' ', 'Recherche un mage de feu', 5, NULL, NULL),
(3, 'Footballeur', ' ', 'Recherche un footballeur qui ne possede pas le bac et qui de preference ne sais pas écrire', 3, NULL, NULL),
(4, 'Prof', ' ', 'Recherche un prof qui a la science infuse', 1, NULL, NULL),
(5, 'Pirate', ' ', 'Recherche un pirate sympa et riche', 4, NULL, NULL),
(6, 'Développeur/gamer', ' ', 'Recherche un développeur qui joue à league of legend et qui rage jamais', 3, NULL, NULL),
(7, 'Troll', ' ', 'On vous prendra pas, pas la peine de postuler', 2, NULL, NULL),
(8, 'Web Dev', NULL, 'Nous souhaitons renforcer notre équipe web pour un futur projet', 3, 5, NULL);

INSERT INTO `job_skill` (`job_id`, `skill_id`) VALUES
(1, 1),
(8, 6),
(8, 7),
(8, 8),
(1, 9),
(1, 11);

INSERT INTO `skill` (`id_skill`, `name_skill`, `type_skill`) VALUES
(1, 'JAVA', 'Langage'),
(2, 'SQL', 'Langage'),
(3, 'C', 'Langage'),
(4, 'C++', 'Langage'),
(5, 'Python', 'Langage'),
(6, 'HTML', 'Langage'),
(7, 'CSS', 'Langage'),
(8, 'Javascript', 'Langage'),
(9, 'Eclipse', 'Logiciel'),
(10, 'StarUML', 'Logiciel'),
(11, 'Git Bash', 'Logiciel'),
(12, 'Gestion des conflits', 'Social'),
(13, 'Symphony', 'Framework'),
(14, 'Gestion de projet', 'Management'),
(15, 'Négociation', 'Social'),
(16, 'Encadrer', 'management'),
(17, 'Comptabilité', 'Finance'),
(18, 'Marketing', 'Finance'),
(19, 'Code du travail', 'Droit'),
(20, 'Droit syndical', 'Droit'),
(21, 'Technique de documentation', 'Documentation'),
(22, 'Normes qualité', 'Contrôle'),
(23, 'Logiciels statistiques', 'Logiciel'),
(24, 'Sécurité incendie', 'Réglementation'),
(25, 'Secourisme', 'Sécurité'),
(26, 'Architecture fonctionnelle', 'Informatique'),
(27, 'Connaissance SOA', 'Informatique'),
(28, 'Diagnostic et résolution', 'Informatique'),
(29, 'Mise en production', 'Informatique'),
(30, 'Processus métiers', 'Informatique'),
(31, 'Gestion de bases de données', 'Informatique'),
(32, 'Plan de tests', 'Informatique'),
(33, 'Linux', 'Informatique'),
(34, 'Anglais technique', 'Language'),
(35, 'Espagnol', 'Language'),
(36, 'Anglais', 'Language'),
(37, 'Culture internet', 'Social'),
(38, 'Maîtrise d ouvrage', 'Gestion'),
(39, 'Elaborer un cahier des charges', 'Informatique'),
(40, 'Autonomie/Confiance   en soi', 'Comportementales'),
(41, 'Capacité d’adaptation', 'Comportementales'),
(42, 'Créativité/Sens de l innovation', 'Comportementales'),
(43, 'Diplomatie', 'Comportementales'),
(44, 'Rigueur/Fiabilité', 'Comportementales'),
(45, 'blabla', 'test');

INSERT INTO location VALUES (null,null,null,'75000','Paris');
INSERT INTO location VALUES (null,null,null,'69000','Lyon');
INSERT INTO location VALUES (null,null,null,'13000','Marseille');
INSERT INTO location VALUES (null,null,null,'59000','Lille');
INSERT INTO location VALUES (null,null,null,'35000','Rennes');
INSERT INTO location VALUES (null,null,null,'44000','Nantes');
INSERT INTO location VALUES (null,null,null,'33000','Bordeaux');
INSERT INTO location VALUES (null,null,null,'64000','Toulouse');