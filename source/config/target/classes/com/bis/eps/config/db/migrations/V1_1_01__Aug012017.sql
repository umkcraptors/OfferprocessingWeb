
DROP TABLE IF EXISTS `offerprocessing`.`OpUser`;
CREATE TABLE `offerprocessing`.`OpUser` (
  Id BIGINT NOT NULL AUTO_INCREMENT,
  FirstName VARCHAR(50)  NOT NULL,
  LastName VARCHAR(50)  DEFAULT NULL,
  Email VARCHAR(100) NOT NULL,
  WorkPhone VARCHAR(20) DEFAULT NULL,
  MobilePhone VARCHAR(20) DEFAULT NULL,
  UserType VARCHAR(20) DEFAULT NULL,
  UserName VARCHAR(50) NOT NULL,
  Password VARCHAR(250) NOT NULL,
  UserImage MEDIUMBLOB DEFAULT NULL,
  UserImageType VARCHAR(50) DEFAULT NULL,
  Status VARCHAR(20) NOT NULL,
  CreatedDate DATE NOT NULL,
  CreatedBy VARCHAR(10) NOT NULL,
  UpdatedDate DATE NOT NULL,
  UpdatedBy VARCHAR(10) NOT NULL,
  PRIMARY KEY (`Id`),
  INDEX `Idx1_User_UserName` (`UserName`)
) 
COLLATE='utf8mb4_general_ci'
DEFAULT CHARACTER SET = utf8mb4
ENGINE=InnoDB;

DROP TABLE IF EXISTS `offerprocessing`.`Roles`;
CREATE TABLE `offerprocessing`.`Roles` (
  Id BIGINT NOT NULL AUTO_INCREMENT,
  RoleName VARCHAR(100) NOT NULL,
  Status VARCHAR(20) NOT NULL,
  CreatedDate DATE NOT NULL,
  CreatedBy VARCHAR(10) NOT NULL,
  UpdatedDate DATE NOT NULL,
  UpdatedBy VARCHAR(10) NOT NULL,
  PRIMARY KEY (`Id`)
) 
COLLATE='utf8mb4_general_ci'
DEFAULT CHARACTER SET = utf8mb4
ENGINE=InnoDB;

DROP TABLE IF EXISTS `offerprocessing`.`UserRoles`;
CREATE TABLE `offerprocessing`.`UserRoles` (
  Id BIGINT NOT NULL AUTO_INCREMENT,
  RoleId BIGINT,
  OpUserId BIGINT DEFAULT NULL,
  Status VARCHAR(20),
  CreatedDate DATE,
  CreatedBy VARCHAR(10),
  UpdatedDate DATE,
  UpdatedBy VARCHAR(10),
  PRIMARY KEY (`Id`),
  FOREIGN KEY(RoleId) REFERENCES `offerprocessing`.`Roles`(Id),
  FOREIGN KEY(OpUserId) REFERENCES `offerprocessing`.`OpUser`(Id)
) 
COLLATE='utf8mb4_general_ci'
DEFAULT CHARACTER SET = utf8mb4
ENGINE=InnoDB;


INSERT INTO `offerprocessing`.`OpUser` (`Id`, `FirstName`, `LastName`,`Email`, `UserName`, `Password`,`Status`,`CreatedDate`,`CreatedBy`,`UpdatedDate`,`UpdatedBy`) VALUES ('1', 'OP', 'Admin','Admin@gmail.com', 'OPAdmin', 'c9436c72cea8f1f90296f70c2acb902cq7bff165a0b9c02b4da1a6bc299652afffq73f719ffdc2520d71b0d78f871ac9f0ecq710277cf00cdc41a422eefee6c7a1de11q7','new','2016-10-13','dan','2017-01-13','veer');
INSERT INTO `offerprocessing`.`OpUser` (`Id`, `FirstName`, `LastName`,`Email`, `UserName`, `Password`,`Status`,`CreatedDate`,`CreatedBy`,`UpdatedDate`,`UpdatedBy`) VALUES ('2', 'OP', 'User', 'User@gmail.com','OpUser', 'c9436c72cea8f1f90296f70c2acb902cq7bff165a0b9c02b4da1a6bc299652afffq73f719ffdc2520d71b0d78f871ac9f0ecq710277cf00cdc41a422eefee6c7a1de11q7','active','2015-07-23','mark','2016-08-09','syam');


INSERT INTO `offerprocessing`.`Roles` (`Id`, `RoleName`,`Status`,`CreatedDate`,`CreatedBy`,`UpdatedDate`,`UpdatedBy`) VALUES ('1', 'ROLE_ADMIN', 'initial', '2016-08-09', 'Rose', '2017-08-09', 'Ram');
INSERT INTO `offerprocessing`.`Roles` (`Id`, `RoleName`,`Status`,`CreatedDate`,`CreatedBy`,`UpdatedDate`,`UpdatedBy`) VALUES ('2', 'ROLE_USER','initial', '2014-08-09', 'ronald', '2015-08-09', 'lakki');


INSERT INTO `offerprocessing`.`UserRoles` (`Id`, `RoleId`, `OpUserId`) VALUES ('1', '1', '1');
INSERT INTO `offerprocessing`.`UserRoles` (`Id`, `RoleId`, `OpUserId`) VALUES ('2', '2', '1');
INSERT INTO `offerprocessing`.`UserRoles` (`Id`, `RoleId`, `OpUserId`) VALUES ('3', '2', '2');
