-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 14 Septembre 2017 à 10:11
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `matchup`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrator`
--

CREATE TABLE `administrator` (
  `id_admin` int(11) NOT NULL,
  `lastname_admin` varchar(255) DEFAULT NULL,
  `firstname_admin` varchar(255) DEFAULT NULL,
  `mail_admin` varchar(255) DEFAULT NULL,
  `phone_admin` varchar(12) DEFAULT NULL,
  `logo_admin` blob,
  `role_admin` varchar(20) DEFAULT NULL,
  `login_admin` varchar(255) DEFAULT NULL,
  `password_admin` varchar(255) DEFAULT NULL,
  `valid` enum('TRUE','FALSE') NOT NULL DEFAULT 'FALSE'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `administrator`
--

INSERT INTO `administrator` (`id_admin`, `lastname_admin`, `firstname_admin`, `mail_admin`, `phone_admin`, `logo_admin`, `role_admin`, `login_admin`, `password_admin`, `valid`) VALUES
(1, 'leboss', 'dujava', 'lebossdujava@orange.fr', '0845126398', NULL, 'ADMIN', 'admin', 'admin', 'TRUE');

-- --------------------------------------------------------

--
-- Structure de la table `avatar`
--

CREATE TABLE `avatar` (
  `id` bigint(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `extension` varchar(5) DEFAULT NULL,
  `image` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `candidate`
--

CREATE TABLE `candidate` (
  `id_candidate` int(11) NOT NULL,
  `lastname_candidate` varchar(255) DEFAULT NULL,
  `firstname_candidate` varchar(255) DEFAULT NULL,
  `phone_candidate` varchar(12) DEFAULT NULL,
  `birthday_candidate` date DEFAULT NULL,
  `address_candidate` varchar(255) DEFAULT NULL,
  `mail_candidate` varchar(255) DEFAULT NULL,
  `picture_candidate` blob,
  `presentation_candidate` text,
  `login_candidate` varchar(255) DEFAULT NULL,
  `password_candidate` varchar(255) DEFAULT NULL,
  `role_candidate` varchar(20) DEFAULT NULL,
  `valid` enum('TRUE','FALSE') NOT NULL DEFAULT 'FALSE'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `candidate`
--

INSERT INTO `candidate` (`id_candidate`, `lastname_candidate`, `firstname_candidate`, `phone_candidate`, `birthday_candidate`, `address_candidate`, `mail_candidate`, `picture_candidate`, `presentation_candidate`, `login_candidate`, `password_candidate`, `role_candidate`, `valid`) VALUES
(1, 'DRAGNIR', 'Natsu', '987654321', '2017-09-09', '1 rue de la liberté', 'natsu.dragnir@orange.fr', NULL, 'Bonjour je suis natsu DRAGNIR ', 'Nat', 'pwd', 'candidate', 'FALSE'),
(2, 'NEYMAR', 'Jean', '1234567890', '2017-09-09', '1 rue de PSG', 'jean.neymar@orange.fr', NULL, 'Bonjour je vaux 222 millions €', 'Jean', 'foot', 'candidate', 'FALSE'),
(3, 'null', 'null', 'null', NULL, 'null', 'blabla@super.tor', 0x6e756c6c, 'null', 'blablator', 'blator', 'CANDIDATE', 'FALSE');

-- --------------------------------------------------------

--
-- Structure de la table `candidate_skill`
--

CREATE TABLE `candidate_skill` (
  `candidate_id` int(11) NOT NULL,
  `skill_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `contract_type`
--

CREATE TABLE `contract_type` (
  `id_contract` int(11) NOT NULL,
  `name_contract` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `contract_type`
--

INSERT INTO `contract_type` (`id_contract`, `name_contract`) VALUES
(1, 'CDD'),
(2, 'CDI'),
(3, 'ALTERNANCE'),
(4, 'CONTRAT DE PROFESSIONALISATION'),
(5, 'INTERIM');

-- --------------------------------------------------------

--
-- Structure de la table `enterprise`
--

CREATE TABLE `enterprise` (
  `id_enterprise` int(11) NOT NULL,
  `name_enterprise` varchar(255) DEFAULT NULL,
  `phone_enterprise` varchar(12) DEFAULT NULL,
  `address_enterprise` varchar(255) DEFAULT NULL,
  `city_enterprise` varchar(255) DEFAULT NULL,
  `website_enterprise` varchar(255) DEFAULT NULL,
  `mail_enterprise` varchar(255) DEFAULT NULL,
  `presentation_enterprise` text,
  `logo_enterprise` blob,
  `twitter_enterprise` varchar(255) DEFAULT NULL,
  `linkedin_enterprise` varchar(255) DEFAULT NULL,
  `activityfield_enterprise` varchar(255) DEFAULT NULL,
  `role_enterprise` varchar(20) DEFAULT NULL,
  `login_enterprise` varchar(255) DEFAULT NULL,
  `password_enterprise` varchar(255) DEFAULT NULL,
  `valid` enum('TRUE','FALSE') NOT NULL DEFAULT 'FALSE'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `enterprise`
--

INSERT INTO `enterprise` (`id_enterprise`, `name_enterprise`, `phone_enterprise`, `address_enterprise`, `city_enterprise`, `website_enterprise`, `mail_enterprise`, `presentation_enterprise`, `logo_enterprise`, `twitter_enterprise`, `linkedin_enterprise`, `activityfield_enterprise`, `role_enterprise`, `login_enterprise`, `password_enterprise`, `valid`) VALUES
(1, 'QUATAR', '102030405', '1 rue du quatar', 'PARIS', 'lesrichesduMoyenOrient.com', 'lesrichesduMoyenOrient@pretentieux.com', 'Bonjour je possede une carte bleue non je voulais dire une carte dieu', NULL, 'lesrichesduMoyenOrient@twitter.com', 'lesrichesduMoyenOrient@linkedin.com', 'Recherche de footballeur sans le bac', 'enterprise', 'dieuxDuFoot', 'petrole', 'FALSE'),
(2, 'FAIRYTAIL', '607080910', '1 rue de Magnolia', 'MAGNOLIA', 'fairytail.com', 'fairytail@pauvre.com', 'Bonjour je suis une guilde', 0x6e756c6c, 'fairytail@twitter.com', 'fairytail@linkedin.com', 'Recherche de mage funs', 'COMPANY', 'makarof', 'fee', 'TRUE'),
(3, 'SCIENCEINFUSE', '9874561236', '1 rue du savoir', 'RENNES', 'lascienceinfuse.com', 'lascienceinfuse@pretentieux.com', 'Je sais tout', NULL, 'lascienceinfuse@twitter.com', 'lascienceinfuse@linkedin.com', 'Recherche de savoir être ', 'enterprise', 'Eisnstein', 'prof', 'FALSE'),
(4, 'ONEPIECE', '8569741252', '1 rue de Redline', 'FUSCHIA', 'lespiratesdunouveaumonde.com', 'lespiratesdunouveaumonde@pirate.com', 'Bonjour je suis le roi des pirates', NULL, 'lespiratesdunouveaumonde@twitter.com', 'lespiratesdunouveaumonde@linkedin.com', 'Recherche de pirate', 'enterprise', 'chapeauDePaille', 'luffy', 'FALSE'),
(5, 'LOL', '4578129632', '1 rue de riot games', 'LOS ANGELES', 'gamers.com', 'gamers@nolife.com', 'Bonjour je recherche des developpers/gamers', NULL, 'gamers@twitter.com', 'gamers@linkedin.com', 'Recherche de joueurs très mauvais', 'enterprise', 'allstar', 'nexus', 'FALSE'),
(6, 'TROLL', '4525658579', '1 rue du cest pas ici', 'TROLLCITY', '.com', 'cestpasici@vienspas.com', 'Bonjour je ne recherche pas des trolls cest faux', NULL, 'cestpasici@twitter.com', 'cestpasici@linkedin.com', 'Recheche personne ', 'enterprise', 'carleric', 'non', 'FALSE'),
(7, 'null', 'null', 'null', 'null', 'null', 'admin@starforge.inc', 'null', 0x6e756c6c, 'null', 'null', 'null', 'COMPANY', 'starforge', 'star', 'FALSE');

-- --------------------------------------------------------

--
-- Structure de la table `fulladress`
--

CREATE TABLE `fulladress` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `pays` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `zipcode` mediumint(8) UNSIGNED DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `headhunter`
--

CREATE TABLE `headhunter` (
  `id_headhunter` int(11) NOT NULL,
  `lastname_headhunter` varchar(255) DEFAULT NULL,
  `firstname_headhunter` varchar(255) DEFAULT NULL,
  `phone_headhunter` varchar(12) DEFAULT NULL,
  `mail_headhunter` varchar(255) DEFAULT NULL,
  `picture_headhunter` blob,
  `twitter_headhunter` varchar(255) DEFAULT NULL,
  `linkedin_headhunter` varchar(255) DEFAULT NULL,
  `presentation_headhunter` text,
  `login_headhunter` varchar(255) DEFAULT NULL,
  `password_headhunter` varchar(255) DEFAULT NULL,
  `role_headhunter` varchar(20) DEFAULT NULL,
  `valid` enum('TRUE','FALSE') NOT NULL DEFAULT 'FALSE'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `headhunter`
--

INSERT INTO `headhunter` (`id_headhunter`, `lastname_headhunter`, `firstname_headhunter`, `phone_headhunter`, `mail_headhunter`, `picture_headhunter`, `twitter_headhunter`, `linkedin_headhunter`, `presentation_headhunter`, `login_headhunter`, `password_headhunter`, `role_headhunter`, `valid`) VALUES
(1, 'Markides', 'Sacha', '1245789656', 'sacha.markides@orange.fr', NULL, 'sacha.markides@twitter.fr', 'sacha.markides@linkedin.fr', 'bonjour je suis un headhunter', 'root', 'root', 'headhunter', 'FALSE'),
(2, 'null', 'null', 'null', 'toto@trololo.fr', 0x6e756c6c, 'null', 'null', 'null', 'totoDeTrololo', 'toto', 'HEADHUNTER', 'FALSE');

-- --------------------------------------------------------

--
-- Structure de la table `headhunter_enterprise`
--

CREATE TABLE `headhunter_enterprise` (
  `headhunter_id` int(11) NOT NULL,
  `enterprise_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `headhunter_enterprise`
--

INSERT INTO `headhunter_enterprise` (`headhunter_id`, `enterprise_id`) VALUES
(1, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `job`
--

CREATE TABLE `job` (
  `id_job` int(11) NOT NULL,
  `title_job` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `presentation_job` text,
  `contract_id` int(11) DEFAULT NULL,
  `enterprise_id` int(11) DEFAULT NULL,
  `headhunter_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `job`
--

INSERT INTO `job` (`id_job`, `title_job`, `address`, `presentation_job`, `contract_id`, `enterprise_id`, `headhunter_id`) VALUES
(1, 'Développeur', ':,0,', 'Recherche un développeur java', 2, 5, NULL),
(2, 'Mage', ' ', 'Recherche un mage de feu', 5, NULL, NULL),
(3, 'Footballeur', ' ', 'Recherche un footballeur qui ne possede pas le bac et qui de preference ne sais pas écrire', 3, NULL, NULL),
(4, 'Prof', ' ', 'Recherche un prof qui a la science infuse', 1, NULL, NULL),
(5, 'Pirate', ' ', 'Recherche un pirate sympa et riche', 4, NULL, NULL),
(6, 'Développeur/gamer', ' ', 'Recherche un développeur qui joue à league of legend et qui rage jamais', 3, NULL, NULL),
(7, 'Troll', ' ', 'On vous prendra pas, pas la peine de postuler', 2, NULL, NULL),
(8, 'Web Dev', NULL, 'Nous souhaitons renforcer notre équipe web pour un futur projet', 3, 5, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `job_skill`
--

CREATE TABLE `job_skill` (
  `job_id` int(11) NOT NULL,
  `skill_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `job_skill`
--

INSERT INTO `job_skill` (`job_id`, `skill_id`) VALUES
(1, 1),
(8, 6),
(8, 7),
(8, 8),
(1, 9),
(1, 11);

-- --------------------------------------------------------

--
-- Structure de la table `skill`
--

CREATE TABLE `skill` (
  `id_skill` int(11) NOT NULL,
  `name_skill` varchar(255) DEFAULT NULL,
  `type_skill` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `skill`
--

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
(11, 'Git Bash', 'Logiciel');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`id_admin`);

--
-- Index pour la table `avatar`
--
ALTER TABLE `avatar`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `candidate`
--
ALTER TABLE `candidate`
  ADD PRIMARY KEY (`id_candidate`);

--
-- Index pour la table `candidate_skill`
--
ALTER TABLE `candidate_skill`
  ADD PRIMARY KEY (`candidate_id`,`skill_id`),
  ADD KEY `fk_cs_skill` (`skill_id`);

--
-- Index pour la table `contract_type`
--
ALTER TABLE `contract_type`
  ADD PRIMARY KEY (`id_contract`);

--
-- Index pour la table `enterprise`
--
ALTER TABLE `enterprise`
  ADD PRIMARY KEY (`id_enterprise`);

--
-- Index pour la table `fulladress`
--
ALTER TABLE `fulladress`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `headhunter`
--
ALTER TABLE `headhunter`
  ADD PRIMARY KEY (`id_headhunter`);

--
-- Index pour la table `headhunter_enterprise`
--
ALTER TABLE `headhunter_enterprise`
  ADD PRIMARY KEY (`headhunter_id`,`enterprise_id`),
  ADD KEY `fk_he_enterprise` (`enterprise_id`);

--
-- Index pour la table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`id_job`),
  ADD KEY `fk_job_contract_type` (`contract_id`),
  ADD KEY `fk_job_enterprise` (`enterprise_id`),
  ADD KEY `fk_job_headhunter` (`headhunter_id`);

--
-- Index pour la table `job_skill`
--
ALTER TABLE `job_skill`
  ADD PRIMARY KEY (`job_id`,`skill_id`),
  ADD KEY `fk_js_skill` (`skill_id`);

--
-- Index pour la table `skill`
--
ALTER TABLE `skill`
  ADD PRIMARY KEY (`id_skill`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `administrator`
--
ALTER TABLE `administrator`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `candidate`
--
ALTER TABLE `candidate`
  MODIFY `id_candidate` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `contract_type`
--
ALTER TABLE `contract_type`
  MODIFY `id_contract` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `enterprise`
--
ALTER TABLE `enterprise`
  MODIFY `id_enterprise` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT pour la table `fulladress`
--
ALTER TABLE `fulladress`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `headhunter`
--
ALTER TABLE `headhunter`
  MODIFY `id_headhunter` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `job`
--
ALTER TABLE `job`
  MODIFY `id_job` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT pour la table `skill`
--
ALTER TABLE `skill`
  MODIFY `id_skill` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `candidate_skill`
--
ALTER TABLE `candidate_skill`
  ADD CONSTRAINT `fk_cs_candidate` FOREIGN KEY (`candidate_id`) REFERENCES `candidate` (`id_candidate`),
  ADD CONSTRAINT `fk_cs_skill` FOREIGN KEY (`skill_id`) REFERENCES `skill` (`id_skill`);

--
-- Contraintes pour la table `headhunter_enterprise`
--
ALTER TABLE `headhunter_enterprise`
  ADD CONSTRAINT `fk_he_enterprise` FOREIGN KEY (`enterprise_id`) REFERENCES `enterprise` (`id_enterprise`),
  ADD CONSTRAINT `fk_he_headhunter` FOREIGN KEY (`headhunter_id`) REFERENCES `headhunter` (`id_headhunter`);

--
-- Contraintes pour la table `job`
--
ALTER TABLE `job`
  ADD CONSTRAINT `fk_job_contract_type` FOREIGN KEY (`contract_id`) REFERENCES `contract_type` (`id_contract`),
  ADD CONSTRAINT `fk_job_enterprise` FOREIGN KEY (`enterprise_id`) REFERENCES `enterprise` (`id_enterprise`),
  ADD CONSTRAINT `fk_job_headhunter` FOREIGN KEY (`headhunter_id`) REFERENCES `headhunter` (`id_headhunter`);

--
-- Contraintes pour la table `job_skill`
--
ALTER TABLE `job_skill`
  ADD CONSTRAINT `fk_js_candidate` FOREIGN KEY (`job_id`) REFERENCES `job` (`id_job`),
  ADD CONSTRAINT `fk_js_skill` FOREIGN KEY (`skill_id`) REFERENCES `skill` (`id_skill`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
