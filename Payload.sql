CREATE TABLE `PAYLOAD` (                                
`ID` int(11) NOT NULL AUTO_INCREMENT,  
`DESCRIPTION` varchar(500) DEFAULT NULL,                       
`PAYLOAD` LONGTEXT DEFAULT NULL,                 
`SYSDATE` TIMESTAMP DEFAULT NOW(),     
PRIMARY KEY (`ID`)                                     
) ENGINE=InnoDB DEFAULT CHARSET=latin1;