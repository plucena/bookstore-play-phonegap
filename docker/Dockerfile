FROM mysql

USER root

ADD init.sql /opt

ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=books
ENV STARTUP_SQL=/opt/init.sql


RUN apt-get update

RUN apt-get -y install git

RUN apt-get -y install openjdk-7-jdk

RUN  apt-get -y install fakeroot

WORKDIR /opt

RUN git clone https://github.com/plucena/loja.git


WORKDIR /opt/loja/webservices

RUN chmod 777 package
 
RUN ./package

RUN find /opt | grep bookstore-1.0

RUN dpkg -i /opt/loja/webservices/target/BookStore_1.0-SNAPSHOT_all.deb

ADD init.sh /opt

RUN chmod 777 /opt/init.sh

CMD ["/opt/init.sh"]
