All My question:w2
================

1.create an azure vm from central using ubuntu attach  addtional 8gb volume

2.pull the ubuntu image from dockerhub and launch the web app in the port 8080 and the app should reachable globally

3.deploy nginx app on k8s cluster and it should be available across the cluster on port 80 

4.deploy a web app in k8s pod and create a replica set in any case load is going to increase on replica set increase the no of replica for the pod 

5.we have an Ec2 instance in N.Virginia region where a web server is running create custom image of this server and launch a new server in ohio region

6.using of ansible config management tool install httpd package and start make it enable of the service and copy fstab file into tmp folder on the remote server via playbook

7.Deploy docker an instance and create a docker image store the docker image in ECR and achieve this image on your ECS cluster using the ECR image and build the sample java based app

8.create an EC2 instance in mumbai region and security group where port 22 and 80 using terraform

9.configure a cross azure load balancer and where my weba app is going to expose on port 80 and configure NAT role on the vm





All My question: w2 answer
================

1.create an azure vm from central using ubuntu attach  addtional 8gb volume

2.pull the ubuntu image from dockerhub and launch the web app in the port 8080 and the app should reachable globally

3.deploy nginx app on k8s cluster and it should be available across the cluster on port 80 

4.deploy a web app in k8s pod and create a replica set in any case load is going to increase on replica set increase the no of replica for the pod 

5.we have an Ec2 instance in N.Virginia region where a web server is running create custom image of this server and launch a new server in ohio region

6.using of ansible config management tool install httpd package and start make it enable of the service and copy fstab file into tmp folder on the remote server via playbook

7.Deploy docker an instance and create a docker image store the docker image in ECR and achieve this image on your ECS cluster using the ECR image and build the sample java based app

8.create an EC2 instance in mumbai region and security group where port 22 and 80 using terraform

9.configure a cross azure load balancer and where my weba app is going to expose on port 80 and configure NAT role on the vm


#############################


My Question 1:
==============

create an azure vm from central using ubuntu attach  addtional 8gb volume
==========================================================================


create resource group-->click virtual machine-->name it-->choose ubuntu-->remaining all are same-->choose standard ssd-->click review+create-->click create

search disks in search box-->click create-->choose the resource group-->name it-->click change size-->click review+create-->click create

go the vm ware that we created-->click disk in right side-->in bottom click attach existing disk-->click the dropdown box and attach the size that we created -->click apply


#############################


My Question 2:
===============

create the ec2 instance-->name it-->choose amazon linux-->security group-----22,8080,80-->click launch instance

connect to the command prompt

#sudo su -

#yum install docker* -y

#systemctl start docker

#systemctl enable docker

#systemctl status docker

#rpmquery docker

#docker pull ubuntu:latest

#docker images

#docker run -it --name web-server -p 8080:80 ubuntu:latest /bin/bash

#apt-get update -y

#apt-get install apache2 -y

#cd /var/www/html/

#echo "devops" > index.html

#ll

#service apache2 start

ctrl p+q

#docker ps -a

##docker inspect web-server | less

copy the ip address and paste in chrome :80

########################################################


My Question 3:
===============

create the ec2 instance

create the iam role-->administratoraccess,amazonec2fullaccess,cloudformationfull,cloudfrontfullaccess,iamfullaccess-->and attach the role to ec2

#sudo su -

#curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"

#unzip awscliv2.zip

#sudo ./aws/install

#curl -O https://s3.us-west-2.amazonaws.com/amazon-eks/1.27.1/2023-04-19/bin/linux/amd64/kubectl

#chmod +x ./kubectl 

#mv ./kubectl /bin/kubectl

#curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp

#kubectl version

#cd /tmp

#mv /tmp/eksctl /bin

#eksctl create cluster --name milestone-cluster \
	--region us-east-1 \
	--node-type t2.small \

#vim deploy.yml

apiVersion: apps/v1
kind: Deployment
metadata:
  name: nginx-deployment
  labels:
    app: nginx
spec:
  selector:
    matchLabels:
      app: nginx
  replicas: 2
  template:
    metadata:
      labels:
        app: nginx
    spec:
      containers:
      - name: nginx
        image: nginx:latest
        ports:
        - containerPort: 80


#kubectl apply -f deploy.yml

#kubectl describe deployment nginx-deployment

#vim service.yml

apiVersion: v1
kind: Service
metadata:
  name: nginx-service
  labels:
    app: nginx
spec:
  type: LoadBalancer
  selector:
    app: nginx
  ports:
    - protocol: TCP
      port: 80
      targetPort: 80

#kubectl apply -f service.yml

#kubectl get deployments

#kubectl get pods

#kubectl get all

copy the external ip :80

###################################################



My Question 4:
==============

create the ec2 instance

create the iam role-->administratoraccess,amazonec2fullaccess,cloudformationfull,cloudfrontfullaccess,iamfullaccess-->and attach the role to ec2

#sudo su -

#curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"

#unzip awscliv2.zip

#sudo ./aws/install

#curl -O https://s3.us-west-2.amazonaws.com/amazon-eks/1.27.1/2023-04-19/bin/linux/amd64/kubectl

#chmod +x ./kubectl 

#mv ./kubectl /bin/kubectl

#curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp

#kubectl version

#cd /tmp

#mv /tmp/eksctl /bin

#eksctl create cluster --name milestone-cluster \
	--region us-east-1 \
	--node-type t2.small \

#cd

#yum install docker -y

#vim index.html
	hi

#vim Dockerfile

FROM amazonlinux:latest
RUN yum install httpd -y
COPY index.html /var/www/html
CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]
EXPOSE 80

#docker image build -t my-app:latest .

#docker images

create the ecr-->view push commands

#aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/l6c5u8d8

dont put the second command

#docker tag my-app:latest public.ecr.aws/l6c5u8d8/test:latest-->change the docker image name

#docker push public.ecr.aws/l6c5u8d8/test:latest

#vim deploy.yml

apiVersion: apps/v1
kind: Deployment
metadata:
  name: web-app-deployment
  labels:
    app: web-app
spec:
  replicas: 3  # Initial number of replicas
  selector:
    matchLabels:
      app: web-app
  template:
    metadata:
      labels:
        app: web-app
    spec:
      containers:
        - name: web-app-container
          image: your-web-app-image:latest  # Replace with your web app image
          ports:
            - containerPort: 80

#kubectl apply -f deploy.yml

#vim services.yml

apiVersion: v1
kind: Service
metadata:
  name: web-app-service
  labels:
    app: web-app
spec:
  type: LoadBalancer
  selector:
    app: web-app
  ports:
    - protocol: TCP
      port: 80
      targetPort: 80

#kubectl apply -f services.yml

#kubectl get deployments

#kubectl get pods

#vim webapp.yml

apiVersion: autoscaling/v2
kind: HorizontalPodAutoscaler
metadata:
  name: web-app-hpa
spec:
  scaleTargetRef:
    apiVersion: apps/v1
    kind: Deployment
    name: web-app-deployment
  minReplicas: 3
  maxReplicas: 10
  metrics:
    - type: Resource
      resource:
        name: cpu
        target:
          type: Utilization
          averageUtilization: 50

#kubectl apply -f webapp.yml

#kubectl get all


#######################################################


My Question 5:
==============

create the ec2 in N.Virginia region-->amazon-linux-->remaining all keep by the own-->security group ssh,http-->click advanced details

advanced details

	#!/bin/bash
	yum install httpd -y
	echo "This server is running in the Mumbai region" >> /var/www/html/index.html
	systemctl start httpd
	systemctl enable httpd
	useradd admin - redhat -c "admin"

click launch instances

copy the ip address and paste in chrome with :80

click the instances and stop the instances and after click the instances and click acton and click images and templates-->click create image-->name the image-->click add new tag and write anything in that-->click create image

go to N.Virginia region-->click ami-->click action-->click copy ami-->click ohio region in destination region-->click copy ami

go to ohio region--click ami-->click launch instances from ami-->all the thing are own-->copy the code and paste in advanced details-->

	#!/bin/bash
	yum install httpd -y
	echo "This server is running in the Singapore region" >> /var/www/html/index.html
	systemctl start httpd
	systemctl enable httpd
	useradd admin - redhat -c "admin"

click launch instances

copy the public of singpore and paste in chrome


#########################################################


My Question 6:-->in coding we have to private ip
==============


Launch an instance-->name it---ansible-->connect it to the terminal

#yum install ansible-core -y

#vim /etc/ansible/ansible.cfg
	
	inventory = /etc/ansible/hosts or (go to next tab and copy and paste it)

Launch a ec2 instance-->name it----remote_server instance and connect it to the terminal

Copy the private ip of remote_server and add in the hosts file of ansible

	In ansible_server
 
	vim /etc/ansible/hosts
	(paste the private ip of remote_server)


Generate an ssh key, copy the public key and paste it in the authorized keys of remote_server.

	In ansible_server
	#ssh-keygen
	#cd .ssh/
	#cat id_rsa.pub
		(copy the key)
 
	In remote_server
	#cd .ssh/
	#vim authorized_keys
		(Paste the key that we copied)


Write a Playbook in ansible to install,start and enable httpd package and also to copy the fstab file to tmp folder of remote_server

#vim playbook.yml

---
- name: Install and configure HTTPD
  hosts: private ip of remote_server # Replace with your server's hostname or IP
  become: true  # Execute tasks with sudo privileges
  tasks:
    - name: Install httpd package
      package:
        name: httpd
        state: present  # Ensure the package is installed
    - name: Start httpd service
      service:
        name: httpd
        state: started  # Ensure the service is started
        enabled: true   # Enable the service to start on boot
    - name: Copy fstab file to /tmp
      copy:
        src: /etc/fstab  # Source file path on the control machine
        dest: /tmp/fstab  # Destination file path on the remote server


#ansible-playbook playbook.yml
 
Step9: Ckeck the status of httpd in remote_server
 
rpmquery httpd
systemctl status httpd

#######################################################


My Question 8:--->in that terraform coding we have to change the region,ami and key pair name
==============

#yum update -y

awscli

#yum install unzip -y

#curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"

#unzip awscliv2.zip

#./aws/install

#yum install -y yum-utils

#sudo yum-config-manager --add-repo https://rpm.releases.hashicorp.com/AmazonLinux/hashicorp.repo

#yum -y install terraform

#terraform -v

create the iam user-->name it-->click next-->click attach policy directly-->choose administrator access-->click next-->click create-->go inside the user-->click security credential-->click generate access key-->choose cli-->click next-->name it-->click create

#aws configure

#mkdir /terraform

#cd /terraform/

#vim terraform.tf

resource "aws_security_group" "test-sg" {
  name        = "test-sg"
  description = "Allow TLS inbound traffic and all outbound traffic"
  tags = {
    Name = "test-sg"
  }
}
resource "aws_vpc_security_group_ingress_rule" "allow_ssh" {
  security_group_id = aws_security_group.test-sg.id
  cidr_ipv4         = "0.0.0.0/0"
  from_port         = 22
  ip_protocol       = "tcp"
  to_port           = 22
}
resource "aws_vpc_security_group_ingress_rule" "allow_http" {
  security_group_id = aws_security_group.test-sg.id
  cidr_ipv4         = "0.0.0.0/0"
  from_port         = 80
  ip_protocol       = "tcp"
  to_port           = 80
}
resource "aws_vpc_security_group_egress_rule" "allow_all_traffic_ipv4" {
  security_group_id = aws_security_group.test-sg.id
  cidr_ipv4         = "0.0.0.0/0"
  ip_protocol       = "-1" # semantically equivalent to all ports
}
###here ending security group code
resource "aws_instance" "outfirst" {
  ami               = "ami-013e83f579886baeb"
  availability_zone = "ap-south-1a"
  instance_type     = "t2.micro"
  security_groups   = ["${aws_security_group.test-sg.name}"]
  key_name          = "tests-key-pair"
  #root disk
  root_block_device {
    volume_size           = "25"
    volume_type           = "gp2"
    delete_on_termination = true
  }
  user_data = <<-EOF
        #!/bin/bash
        sudo yum install httpd -y
        sudo systemctl start httpd
        sudo systemctl enable httpd
        echo "<h1>Sample webserver using terraform</h1>" | sudo tee /var/www/html/index.html
  EOF
  tags = {
    Name     = "hello_India"
    Stage    = "testing"
    Location = "India"
  }
}


#terraform init

#terraform fmt

#terraform validate

#terraform plan

#terraform apply

check in the mumbai region aws dashboard to see the instance launched

###############################################################

My Question 9:
==============

Step1: Login into the AWS Azure account.

Step2: Create a resource group by giving the name and region.

Step3: Create a VM with the created resource group, give a name, security type as standard, size B1, port 22, 80

Step4: Create a VM with the creates resource group by using the same region but different zones. Assign a name, security type as standard, size B1, ports as 22,80.

##In the networking make sure the virtual network you choose is same as that of the first VM-->in second virtual machine in networking we have to choose the first vnet

Step5: Create a load balancer. Select the resource group which you have created, assign a name, standard, public, regional.
Add frontend IP configuration. Assign a name and create new public ip and save
Add backend pool. Assign a name and select virtual network. Next in the Ip configurations select both the VM's and add it and save.
Create + Review.
Create
After the load balancer have got created edit the health probe.
In health probe, assign a name and save
Add load balancing rules, Assign a name, select frontend ip and backend pool,  and assign port 80 as well backend port as 80, select an existing health probe and save.
Step6: Connect the VM to the terminal
ssh -i .\web-key.pem azure@publicip
Step7: In both the terminals use the below commands
sudo su -
apt update -y
apt install apache2 -y
cd /var/www/html
echo "Hi all" > index.html
cat index.html
Hi all
systemctl restart apache2
systemctl enable apache2
systemctl status apache2
Step8: Copy and paste the ip address of load balancer.
has context menu


---------------------------------------------------


# config file for ansible -- http://ansible.com/
# ==============================================

# nearly all parameters can be overridden in ansible-playbook 
# or with command line flags. ansible will read ANSIBLE_CONFIG,
# ansible.cfg in the current working directory, .ansible.cfg in
# the home directory or /etc/ansible/ansible.cfg, whichever it
# finds first

[defaults]

# some basic default values...

inventory      = /etc/ansible/hosts
remote_tmp     = $HOME/.ansible/tmp
forks          = 150
sudo_user      = root
transport      = smart

# plays will gather facts by default, which contain information about
# the remote system.
#
# smart - gather by default, but don't regather if already gathered
# implicit - gather by default, turn off with gather_facts: False
# explicit - do not gather by default, must say gather_facts: True
gathering = smart

# additional paths to search for roles in, colon separated
roles_path    = $HOME/.ansible/roles

# uncomment this to disable SSH key host checking
host_key_checking = False

# logging is off by default unless this path is defined
# if so defined, consider logrotate
log_path = /var/log/ansible.log

# default module name for /usr/bin/ansible
module_name = shell

# set plugin path directories here, separate with colons
action_plugins     = /usr/share/ansible_plugins/action_plugins:$HOME/.ansible/plugins/action_plugins
callback_plugins   = /usr/share/ansible_plugins/callback_plugins:$HOME/.ansible/plugins/callback_plugins
connection_plugins = /usr/share/ansible_plugins/connection_plugins:$HOME/.ansible/plugins/connection_plugins
lookup_plugins     = /usr/share/ansible_plugins/lookup_plugins:$HOME/.ansible/plugins/lookup_plugins
vars_plugins       = /usr/share/ansible_plugins/vars_plugins:$HOME/.ansible/plugins/vars_plugins
filter_plugins     = /usr/share/ansible_plugins/filter_plugins:$HOME/.ansible/plugins/filter_plugins

# by default callbacks are not loaded for /bin/ansible, enable this if you
# want, for example, a notification or logging callback to also apply to 
# /bin/ansible runs
#bin_ansible_callbacks = False

# the CA certificate path used for validating SSL certs. This path 
# should exist on the controlling node, not the target nodes
# common locations:
# RHEL/CentOS: /etc/pki/tls/certs/ca-bundle.crt
# Fedora     : /etc/pki/ca-trust/extracted/pem/tls-ca-bundle.pem
# Ubuntu     : /usr/share/ca-certificates/cacert.org/cacert.org.crt
ca_file_path = /usr/share/ca-certificates/cacert.org/cacert.org.crt 

# if set to a persistent type (not 'memory', for example 'redis') fact values
# from previous runs in Ansible will be stored.  This may be useful when
# wanting to use, for example, IP information from one group of servers
# without having to talk to them in the same playbook run to get their
# current IP information.
fact_caching = jsonfile
fact_caching_connection = $HOME/.ansible/facts
fact_caching_timeout = 600

# retry files
#retry_files_enabled = False
retry_files_save_path = ~/.ansible/retry

[privilege_escalation]
#become=True
#become_method=sudo
#become_user=root
#become_ask_pass=False

[ssh_connection]

# ssh arguments to use
# Leaving off ControlPersist will result in poor performance, so use 
# paramiko on older platforms rather than removing it
ssh_args = -o ControlMaster=auto -o ControlPersist=60s

# The path to use for the ControlPath sockets. This defaults to
# "%(directory)s/ansible-ssh-%%h-%%p-%%r", however on some systems with
# very long hostnames or very long path names (caused by long user names or 
# deeply nested home directories) this can exceed the character limit on
# file socket names (108 characters for most platforms). In that case, you 
# may wish to shorten the string below.
# 
# Example: 
# control_path = %(directory)s/%%h-%%r
control_path = %(directory)s/ansible-ssh-%%h-%%p-%%r

# Enabling pipelining reduces the number of SSH operations required to 
# execute a module on the remote server. This can result in a significant 
# performance improvement when enabled, however when using "sudo:" you must 
# first disable 'requiretty' in /etc/sudoers
#
# By default, this option is disabled to preserve compatibility with
# sudoers configurations that have requiretty (the default on many distros).
# 
pipelining = True

# if True, make ansible use scp if the connection type is ssh 
# (default is sftp)
scp_if_ssh = True

[accelerate]
accelerate_port = 5099
accelerate_timeout = 30
accelerate_connect_timeout = 5.0

# The daemon timeout is measured in minutes. This time is measured
# from the last activity to the accelerate daemon.
accelerate_daemon_timeout = 30 

# If set to yes, accelerate_multi_key will allow multiple
# private keys to be uploaded to it, though each user must
# have access to the system via SSH to add a new key. The default
# is "no".
#accelerate_multi_key = yes

[selinux]
# file systems that require special treatment when dealing with security context
# the default behaviour that copies the existing context or uses the user default
# needs to be changed to use the file system dependent context.
#special_context_filesystems=nfs,vboxsf,fuse,ramfs
