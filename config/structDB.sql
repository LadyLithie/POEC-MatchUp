CREATE TABLE `administrator` (
  `id_admin` BIGINT NOT NULL  AUTO_INCREMENT,
  `lastname_admin` varchar(255) DEFAULT NULL,
  `firstname_admin` varchar(255) DEFAULT NULL,
  `mail_admin` varchar(255) DEFAULT NULL,
  `phone_admin` varchar(12) DEFAULT NULL,
  `logo_admin` blob,
  `role_admin` varchar(20) DEFAULT NULL,
  `login_admin` varchar(255) DEFAULT NULL,
  `password_admin` varchar(255) DEFAULT NULL,
  `valid` enum('TRUE','FALSE') NOT NULL DEFAULT 'FALSE',
   PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `candidate` (
  `id_candidate` bigint NOT NULL  AUTO_INCREMENT,
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
  `valid` enum('TRUE','FALSE') NOT NULL DEFAULT 'FALSE',
  PRIMARY KEY(`id_candidate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `enterprise` (
  `id_enterprise` bigint NOT NULL AUTO_INCREMENT,
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
  `valid` enum('TRUE','FALSE') NOT NULL DEFAULT 'FALSE',
  PRIMARY KEY(`id_enterprise`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `headhunter` (
  `id_headhunter` bigint NOT NULL AUTO_INCREMENT,
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
  `valid` enum('TRUE','FALSE') NOT NULL DEFAULT 'FALSE',
  PRIMARY KEY(`id_headhunter`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `skill` (
  `id_skill` bigint NOT NULL AUTO_INCREMENT,
  `name_skill` varchar(255) DEFAULT NULL,
  `type_skill` varchar(255) DEFAULT NULL,
  PRIMARY KEY(`id_skill`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

  CREATE TABLE `contract_type` (
    `id_contract` int(11) NOT NULL,
    `name_contract` varchar(50) DEFAULT NULL,
    PRIMARY KEY(`id_contract`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

  CREATE TABLE `location` (
    `id` bigint UNSIGNED NOT NULL,
    `pays` varchar(50) DEFAULT 'France',
    `address` varchar(255) DEFAULT NULL,
    `zipcode` varchar(6)  DEFAULT NULL,
    `city` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

  CREATE TABLE `job` (
    `id_job` bigint NOT NULL AUTO_INCREMENT,
    `title_job` varchar(255) DEFAULT NULL,
    `address` varchar(255) DEFAULT NULL,
    `presentation_job` text,
    `contract_id` bigint DEFAULT NULL,
    `enterprise_id` bigint DEFAULT NULL,
    `headhunter_id` bigint DEFAULT NULL,
    `city_id` bigint DEFAULT NULL,
        PRIMARY KEY(`id_job`),
    CONSTRAINT fk_enterprise_city FOREIGN KEY (`city_id`) REFERENCES location(`id`),
  	CONSTRAINT fk_job_contract_type FOREIGN KEY (`contract_id`) REFERENCES contract_type(`id_contract`),
  	CONSTRAINT fk_job_enterprise FOREIGN KEY (`enterprise_id`) REFERENCES enterprise(`id_enterprise`),
  	CONSTRAINT fk_job_headhunter FOREIGN KEY (`headhunter_id`) REFERENCES headhunter(`id_headhunter`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

  CREATE TABLE `headhunter_enterprise` (
  headhunter_id bigint NOT NULL,
  enterprise_id bigint NOT NULL
  PRIMARY KEY(headhunter_id, enterprise_id),
	CONSTRAINT fk_he_headhunter FOREIGN KEY (headhunter_id) REFERENCES headhunter(id_headhunter),
	CONSTRAINT fk_he_enterprise FOREIGN KEY (enterprise_id) REFERENCES enterprise(id_enterprise)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE candidate_skill(
	candidate_id INT NOT NULL,
	skill_id INT NOT NULL,
	PRIMARY KEY(candidate_id, skill_id),
	CONSTRAINT fk_cs_candidate FOREIGN KEY (candidate_id) REFERENCES candidate(id_candidate),
	CONSTRAINT fk_cs_skill FOREIGN KEY (skill_id) REFERENCES skill(id_skill)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `job_skill` (
  job_id bigint NOT NULL,
  skill_id bigint NOT NULL
  PRIMARY KEY(job_id, skill_id),
	CONSTRAINT fk_js_candidate FOREIGN KEY (job_id) REFERENCES job(id_job),
	CONSTRAINT fk_js_skill FOREIGN KEY (skill_id) REFERENCES skill(id_skill)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

