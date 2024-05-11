All question m1
===============

1.deploy a ec2 instance using of t2.micro instance in Mumbai region in zone ap-south-1a. Configure web server on it and make it live, and attach 5gb ebs volume. Where create 10 files like training.txt

2.my one team is working with in Mumbai india region and they have some important data in the ebs volume. And another team is working with Singapore region. They also want to access same data which is available in mumbai region. Share it in different region.

3.i have on web server in mumbai region where my website is running. I need same server in Singapore region Migrate this web server from Mumbai to Singapore

4.Launch a AWS S3 bucket with Uniqueame, and upload some objects. And this S3 bucket should be reachable on windows host from where I can upload the object in the AWS S3 bucket

5.Create a custom VPC. Where you need to create two Subnets like Private subnet and Public subnet in the public subnet I want to host my web server. Where my website is running and Private subnet my database is running. Data base should not be reachable publically

6.create two custom VPC one in Mumbai Region and Another is in Singapore Region.so configure VPC peering in between Mumbai and Singapore

7.Deploy an EC2 instance using with cloud formation in Mumbai Region ap-south-la zone. Instance should be reachable

8.We people are working on a common project in a sale region. But my servers are in different zones, Sol want to share project information with everyone simultaneously. configure efs storage it should be mount on every server

9.Enable MFA on root account on AWS account, and generate access key and secret key for root account.

10.Create an IAM role for cloud formation service with administrator full access. And create a stack to deploy of your Json code




#sudo su -

m1 answer

#useradd thor

#useradd thanos

#useradd ironman

#useradd captainamerica

#passwd thor

#passwd thanos

#passwd ironman

#passwd captainamerica

#groupadd sales

#groupadd marketing

#usermod -G sales thanos

#usermod -G sales captainamerica

#cat /etc/group | grep -i sales

#mkdir /salesdata

#cd /salesdata/

#ll -d /salesdata/

#chgrp sales /salesdata

#chmod 770 /salesdata/

#su - thanos

#cd /salesdata/

#cat > th.txt
	hi

#ll

#exit

#su - captainamerica

#cd /salesdata/

#cat captainamerica.txt
	hi

#ll

#cat th.txt

#cat > th.txt

#exit

#chmod o+t /salesdata/

#su - captainamerica

#cd /salesdata/

#ll

#rm -rf th.txt

#exit

#chmod o+w /salesdata/th.txt

#su - captainamerica

#cd /salesdata/

#cat > th.txt

#cat th.txt

#ll

#exit






All question
=============

1.deploy a ec2 instance using of t2.micro instance in Mumbai region in zone ap-south-1a. Configure web server on it and make it live, and attach 5gb ebs volume. Where create 10 files like training.txt

2.my one team is working with in Mumbai india region and they have some important data in the ebs volume. And another team is working with Singapore region. They also want to access same data which is available in mumbai region. Share it in different region.

3.i have on web server in mumbai region where my website is running. I need same server in Singapore region Migrate this web server from Mumbai to Singapore

4.Launch a AWS S3 bucket with Uniqueame, and upload some objects. And this S3 bucket should be reachable on windows host from where I can upload the object in the AWS S3 bucket

5.Create a custom VPC. Where you need to create two Subnets like Private subnet and Public subnet in the public subnet I want to host my web server. Where my website is running and Private subnet my database is running. Data base should not be reachable publically

6.create two custom VPC one in Mumbai Region and Another is in Singapore Region.so configure VPC peering in between Mumbai and Singapore

7.Deploy an EC2 instance using with cloud formation in Mumbai Region ap-south-la zone. Instance should be reachable

8.We people are working on a common project in a sale region. But my servers are in different zones, Sol want to share project information with everyone simultaneously. configure efs storage it should be mount on every server

9.Enable MFA on root account on AWS account, and generate access key and secret key for root account.

10.Create an IAM role for cloud formation service with administrator full access. And create a stack to deploy of your Json code




Question: 1
============

1.Deploy an ec2 instances using of t2.micro instance in mumbai region in zone ap-south-1a. Configure web server on it and make it live, and attach a 5GB ebs volume where create 10 files, like training.txt


1).click launch instances in mumbai region-->name-web-server-->choose t2.micro-->choose ap-south-1a in subnet-->add http,ssh in security group-->click launch instances

click volumes-->choose gp2 in volume type-->choose 5 gb in size-->click create volume-->click attach volume-->choose the instances-->choose /dev/sdb-->click attach volume

open command prompt

#yum update -y

#yum install httpd -y

#systemctl enable httpd

#systemctl start httpd

#systemctl status httpd

For volume:
===========

#lsblk

#mkfs and press tab

#mkfs.ext4 /dev/xvdb

#blkid

copy the UUID

--------------------------------------------
Temporary Mount:
=================

#mkdir /folder

#mount /dev/xvdb /folder/

#df -h

#cd /folder/

#touch training.txt{1..10}

#ls

#cd

Permanent Mount:
================

#mkdir /folder

#blkid

copy the UUID

#vim /etc/fstab

	#data vol
	UUID=..............   /folder  ext4  defaults  0 0

#cd /folder/

#touch training.txt{1..10}

#ls

#cd


###################################################################


Question:2
===========

my one team


click launch instances in mumbai region-->name-web-server-->choose t2.micro-->choose ap-south-1a in subnet-->add http,ssh in security group-->click launch instances

click volumes-->choose gp2 in volume type-->choose 5 gb in size-->click create volume-->click attach volume-->choose the instances-->choose /dev/sdb-->click attach volume

open command prompt

#yum update -y

#yum install httpd -y

#systemctl enable httpd

#systemctl start httpd

#systemctl status httpd

For volume:
===========

#lsblk

#mkfs and press tab

#mkfs.ext4 /dev/xvdb

#blkid

copy the UUID

--------------------------------------------
Temporary Mount:
=================

#mkdir /folder

#mount /dev/xvdb /folder/

#df -h

#cd /folder/

#touch training.txt{1..10}

#ls

#cd

Permanent Mount:
================

#mkdir /folder

#blkid

copy the UUID

#vim /etc/fstab

	#data vol
	UUID=..............   /folder  ext4  defaults  0 0

#cd /folder/

#touch training.txt{1..10}

#ls

#cd

Reboot the instances


click snapshot-->click create snapshot-->resource type-volume-->select the volume id-->click create snapshot

 
Create the another ec2 in singapore region

go to mumbai region

select the snapshot-->click action-->click copy snapshot-->choose the same zone that we used for singapore instances-->click copy snapshot

go to singapore server

select the snapshot-->click create volume from snapshot-->choose gp2-->size 5-->click create volume-->click actions-->click attach volume

connect singapore ec2 to prompt

#lsblk

#mkdir /tech-data

#mount /dev/xvdb /tech-data/

#df -h

#cd /data/

#ls

#cd

############################################################


Question 3:
===========

create the ec2 in mumbai region-->amazon-linux-->remaining all keep by the own-->security group ssh,http-->click advanced details

advanced details

	#!/bin/bash
	yum install httpd -y
	echo "This server is running in the Mumbai region" >> /var/www/html/index.html
	systemctl start httpd
	systemctl enable httpd
	useradd admin - redhat -c "admin"

click launch instances

copy the ip address and paste in chrome with :80

click the instances and stop the instances and after click the instances and click acton and click images and templates-->click create image-->name the image
-->click add new tag and write anything in that-->click create image

go to mumbai region-->click ami-->click action-->click copy ami-->click singapore region in destination region-->click copy ami

go to singapore region--click ami-->click launch instances from ami-->all the thing are own-->copy the code and paste in advanced details-->

	#!/bin/bash
	yum install httpd -y
	echo "This server is running in the Singapore region" >> /var/www/html/index.html
	systemctl start httpd
	systemctl enable httpd
	useradd admin - redhat -c "admin"

click launch instances

copy the public of singpore and paste in chrome

########################################################



Question 4:

click ec2-->name it-->select windows-->security group--rdp,custom tcp,https-->click launch instances

click iam-->click user-->name it-->click tick box-->click I want to create an IAM user-->click custom password-->uncheck the user must-->click save-->click attach policy-->give s3 full access-->
click next-->click create user-->download csv file-->got to the user-->click security creadentials-->click create access key-->use command line interface-->click tick box-->click next-->click done-->download the csv

click s3-->click create bucket-->choose general-->choose acl enable-->bucket owner-->uncheck-->enable in bucket version-->create bucket-->upload files-->select the files-->click upload

click ec2-->connect through rdp client-->download remote desktop-->click getpassword-->upload the key pair that we created for ec2-->decrpyt the password-->go remote desktop-->paste the password-->go to edge-->start without your data-->type tntdrive download-->download exe installer-->go to the downloaded file-->click open file-->click accept the agreement-->click all next-->click no i will restart the computer-->click finish-->go to the pc and install the downloaded file-->go to the desktop-->open the tnt drive-->click account-->click add new mapped drive-->click storage account-->click add-->give access  and secret key-->click add new account-->click save changes-->click add new mapped-->choose the bucket that we created-->click add-->click open-->


########################################################



Question 5:
===========

create a custom vpc

click create vpc-->choose vpc only-->name the vpc-->choose ipv4 in ipv4 CIDR block-->click tick box in auto generate-->put 10.0.0.0/16 in IPV4-->type 
name in tags-->click create

click create subnet-->choose the vpc that we created-->name the subnet---web-subnet-->choose the zone-->10.0.0.0/16 in ipv4 vpc-->10.0.0.0/24 in ipv4 subnet
cidr block-->click create

click create subnet-->choose the vpc that we created-->name the subnet---db-subnet-->choose the different zone-->10.0.0.0/16 in ipv4 vpc-->10.0.1.0/24 in ipv4 subnet cidr block-->click create

click ec2-->name the ec2---web-server-->create the new keypair-->choose the vpc that we created-->choose web-subnet in subnet in network settings-->click enable-->create security group--ssh,http-->click launch instance

click internet gateway in ec2-->name it-->click create-->click actions-->click attach to vpc-->select the vpc that we created-->click save

click route tables-->name it--web-rt-->choose the vpc that we created-->click create table-->click edit-->click add route-->choose 0.0.0.0/0-->choose internet
gateway-->choose igw-->click save-->click subnet association-->click edit-->select web subnet-->click save associations

open command prompt-->connect through ssh client

#sudo su -

#yum install httpd -y

#cd /var/www/html/

#echo "hi" > index.html

#cat index.html

#systemctl restart httpd

#systemctl enable httpd

#systemctl status httpd

#cd

copy the public ip of ec2 that we created and paste in chrome

create the instances-->name--db-server-->same key-->vpc that we created-->choose the zone-->disable ip in third of network settings-->same security that we use for instances-->click launch instances-->edit the security inbound rules-choose all icmp IPV4,anywhere-------------------->we have to choose db-subnet
in network settings for choosing vpc

#ping private ip of db-server instance


########################################################


Question 6

Mumbai Region:
==============


click create vpc-->choose vpc only-->name the vpc-->choose ipv4 in ipv4 CIDR block-->click tick box in auto generate-->put 10.0.0.0/16 in IPV4-->type 
name in tags-->click create

click create subnet-->choose the vpc that we created-->name the subnet---web-subnet-->choose the zone-->10.0.0.0/16 in ipv4 vpc-->10.0.0.0/24 in ipv4 subnet
cidr block-->click create

click create subnet-->choose the vpc that we created-->name the subnet---db-subnet-->choose the different zone-->10.0.0.0/16 in ipv4 vpc-->10.0.1.0/24 in ipv4 subnet cidr block-->click create

click ec2-->name the ec2---web-server-->create the new keypair-->choose the vpc that we created-->choose web-subnet in subnet in network settings-->create security group--ssh,http-->click launch instance

click internet gateway in ec2-->name it-->click create-->click actions-->click attach to vpc-->select the vpc that we created-->click save

click route tables-->name it--web-rt-->choose the vpc that we created-->click create table-->click edit-->click add route-->choose 0.0.0.0/0-->choose internet
gateway-->choose igw-->click save-->click subnet association-->click edit-->select web subnet-->click save associations

open command prompt-->connect through ssh client

#sudo su -

#yum install httpd -y

#cd /var/www/html/

#echo "hi" > index.html

#cat index.html

#systemctl restart httpd

#systemctl enable httpd

#systemctl status httpd

#cd

copy the public ip of ec2 that we created and paste in chrome

create the instances-->name--db-server-->same key-->vpc that we created-->choose the zone-->disable ip in third of network settings-->same security that we use for instances-->click launch instances-->edit the security inbound rules-choose all icmp IPV4,anywhere-------------------->we have to choose db-subnet
in network settings for choosing vpc

#ping private ip of db-server instance


Singapore Region:
=================


click create vpc-->choose vpc only-->name the vpc-->choose ipv4 in ipv4 CIDR block-->click tick box in auto generate-->put 20.0.0.0/16 in IPV4-->type 
name in tags-->click create

click create subnet-->choose the vpc that we created-->name the subnet---web-subnet-->choose the zone-->20.0.0.0/16 in ipv4 vpc-->20.0.0.0/24 in ipv4 subnet
cidr block-->click create

click create subnet-->choose the vpc that we created-->name the subnet---db-subnet-->choose the different zone-->20.0.0.0/16 in ipv4 vpc-->20.0.1.0/24 in ipv4 subnet cidr block-->click create

click ec2-->name the ec2---web-server-->create the new keypair-->choose the vpc that we created-->choose web-subnet in subnet in network settings-->create security group--ssh,http-->click launch instance

click internet gateway-->name it-->click create-->click actions-->click attach to vpc-->select the vpc that we created-->click attach

click route tables-->name it--web-rt-->choose the vpc that we created-->click create table-->click edit-->click add route-->choose 0.0.0.0/0-->choose internet gateway-->choose igw-->click save-->click subnet association-->click edit-->select web subnet-->click save associations

open command prompt-->connect through ssh client

#sudo su -

#yum install httpd -y

#cd /var/www/html/

#echo "hi singapore" > index.html

#cat index.html

#systemctl restart httpd

#systemctl enable httpd

#systemctl status httpd

#cd

copy the public ip of ec2 that we created and paste in chrome

create the instances-->name--db-server-->same key-->vpc that we created-->choose the zone-->disable ip in third of network settings-->same security that we use for instances-->click launch instances-->edit the security inbound rules-choose all icmp IPV4,anywhere-------------------->we have to choose db-subnet
in network settings for choosing vpc

#ping private ip of db-server instance


go to mumbai region:
====================

click peering connection-->click create-->name it-->same vpc that we created-->my account-->another region-->copy the vpc id of singapore and paste in vpc id-->click create


go to singapore region:
========================

go to peering connection-->selec the peering connection-->click action-->click accept request


go to mumbai region:
====================
In Web Route:
=============

click route-->click edit route-->type 20.0.0.0/16-->choose peering connection-->click save changes

#ping ipaddress                               ipaddress--private ip in singapore of ec2

go to Singapore region:
====================
In Web Route:
=============

click route-->click edit route-->type 10.0.0.0/16-->choose peering connection-->click save changes

#ping ipaddress                               ipaddress--private ip in mumbai of ec2



#######################################################


question 7:
===========

see photo


######################################################


Question 8

create the instaces

create the instances-->choose different zone

click efs-->click create file system-->name it-->click create-->go to the efs-->click network-->click manage-->we have to remove all remaining subnet-->select security group that we created for ec2-->click save-->click attach-->copy the nfs client

connect prompt through first instances 

paste the ssh 

#sudo su -

#yum install nfs-utils

#mkdir folder

paste the nfs client

#cd folder

#touch file.txt{1..10}



connect prompt through second instances 

paste the ssh 

#sudo su -

#yum install nfs-utils

#mkdir folder1

paste the nfs client

#cd folder1

#ls

###############################################

Question 9

MFA:
====

in right side under quick links click my security credentials-->click aasign mfa device-->name-->click authenticator app-->click show qr code-->scan the qr code using authenticator app-->put the two mfa code

click create access key-->click create access key



###############################################

question 10:
============

see photo

