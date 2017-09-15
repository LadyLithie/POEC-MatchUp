CREATE TABLE enterprise(
	id_enterprise INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name_enterprise VARCHAR(255),
	phone_enterprise VARCHAR(12),
	address_enterprise VARCHAR(255),
	city_enterprise VARCHAR(255),
	website_enterprise VARCHAR(255),
	mail_enterprise VARCHAR(255),
	presentation_enterprise TEXT,
	logo_enterprise BLOB,
	twitter_enterprise VARCHAR(255),
	linkedin_enterprise VARCHAR(255),
	activityfield_enterprise VARCHAR(255),
	role_enterprise VARCHAR(20),
	login_enterprise VARCHAR(255),
	password_enterprise VARCHAR(255)
	)ENGINE=InnoDB;

CREATE TABLE candidate(
	id_candidate INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	lastname_candidate VARCHAR(255),
	firstname_candidate VARCHAR(255),
	phone_candidate VARCHAR(12),
	birthday_candidate DATE,
	address_candidate VARCHAR(255),
	mail_candidate VARCHAR(255),
	picture_candidate BLOB,
	presentation_candidate TEXT,
	login_candidate VARCHAR(255),
	password_candidate VARCHAR(255),
	role_candidate VARCHAR(20)
	)ENGINE=InnoDB;

CREATE TABLE headhunter(
	id_headhunter INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	lastname_headhunter VARCHAR(255),
	firstname_headhunter VARCHAR(255),
	phone_headhunter VARCHAR(12),
	mail_headhunter VARCHAR(255),
	picture_headhunter BLOB,
	twitter_headhunter VARCHAR(255),
	linkedin_headhunter VARCHAR(255),
	presentation_headhunter TEXT,
	login_headhunter VARCHAR(255),
	password_headhunter VARCHAR(255),
	role_headhunter VARCHAR(20)
	)ENGINE=InnoDB;

	CREATE TABLE headhunter(
		id_headhunter INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
		lastname_headhunter VARCHAR(255),
		firstname_headhunter VARCHAR(255),
		phone_headhunter VARCHAR(12),
		mail_headhunter VARCHAR(255),
		picture_headhunter BLOB,
		twitter_headhunter VARCHAR(255),
		linkedin_headhunter VARCHAR(255),
		presentation_headhunter TEXT,
		login_headhunter VARCHAR(255),
		password_headhunter VARCHAR(255),
		role_headhunter VARCHAR(20)
		)ENGINE=InnoDB;


	CREATE TABLE candidate(
			id_candidate INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
			lastname_candidate VARCHAR(255),
			firstname_candidate VARCHAR(255),
			phone_candidate VARCHAR(12),
			birthday_candidate DATE,
			address_candidate VARCHAR(255),
			mail_candidate VARCHAR(255),
			picture_candidate BLOB,
			presentation_candidate TEXT,
			login_candidate VARCHAR(255),
			password_candidate VARCHAR(255),
			role_candidate VARCHAR(20)
			)ENGINE=InnoDB;

CREATE TABLE administrator(
	id_admin INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	lastname_admin VARCHAR(255),
	firstname_admin VARCHAR(255),
	mail_admin VARCHAR(255),
	phone_admin VARCHAR(12),
	logo_admin BLOB,
	role_admin VARCHAR(20),
	login_admin VARCHAR(255),
	password_admin VARCHAR(255)
	)ENGINE=InnoDB;

CREATE TABLE contract_type(
	id_contract INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name_contract VARCHAR (50)
	)ENGINE=InnoDB;
	
CREATE TABLE city(
	id_city INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name_city VARCHAR(50),
	postal_code_city VARCHAR(5)
	)ENGINE=InnoDB;

CREATE TABLE job(
	id_job INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title_job VARCHAR(255),
	address VARCHAR(255),
	presentation_job TEXT,
	contract_id INT NULL,
	enterprise_id INT NULL,
	headhunter_id INT NULL,
	city_id INT NULL,
	CONSTRAINT fk_enterprise_city FOREIGN KEY (city_id) REFERENCES city(id_city),
	CONSTRAINT fk_job_contract_type FOREIGN KEY (contract_id) REFERENCES contract_type(id_contract),
	CONSTRAINT fk_job_enterprise FOREIGN KEY (enterprise_id) REFERENCES enterprise(id_enterprise),
	CONSTRAINT fk_job_headhunter FOREIGN KEY (headhunter_id) REFERENCES headhunter(id_headhunter)
	)ENGINE=InnoDB;

CREATE TABLE skill(
	id_skill INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name_skill VARCHAR(255),
	type_skill VARCHAR(255)
	)ENGINE=InnoDB;

CREATE TABLE candidate_skill(
	candidate_id INT NOT NULL,
	skill_id INT NOT NULL,
	PRIMARY KEY(candidate_id, skill_id),
	CONSTRAINT fk_cs_candidate FOREIGN KEY (candidate_id) REFERENCES candidate(id_candidate),
	CONSTRAINT fk_cs_skill FOREIGN KEY (skill_id) REFERENCES skill(id_skill)
	)ENGINE=InnoDB;

CREATE TABLE job_skill(
	job_id INT NOT NULL,
	skill_id INT NOT NULL,
	PRIMARY KEY(job_id, skill_id),
	CONSTRAINT fk_js_candidate FOREIGN KEY (job_id) REFERENCES job(id_job),
	CONSTRAINT fk_js_skill FOREIGN KEY (skill_id) REFERENCES skill(id_skill)
	)ENGINE=InnoDB;

CREATE TABLE headhunter_enterprise(
	headhunter_id INT NOT NULL,
	enterprise_id INT NOT NULL,
	PRIMARY KEY(headhunter_id, enterprise_id),
	CONSTRAINT fk_he_headhunter FOREIGN KEY (headhunter_id) REFERENCES headhunter(id_headhunter),
	CONSTRAINT fk_he_enterprise FOREIGN KEY (enterprise_id) REFERENCES enterprise(id_enterprise)
	)ENGINE=InnoDB;
