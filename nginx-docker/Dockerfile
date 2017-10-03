############################################################
# Dockerfile to build Nginx Installed Containers
# Based on Ubuntu
############################################################

# Set the base image to Ubuntu
FROM ubuntu

# File Author / Maintainer
MAINTAINER Maintaner Name

# Install Nginx

# Update the repository
RUN apt-get update

# Install necessary tools
RUN apt-get install -y nano wget dialog net-tools

# Download and Install Nginx
RUN apt-get install -y nginx  
RUN apt-get install -y nodejs  

# Remove the default Nginx configuration file
RUN rm -v /etc/nginx/sites-enabled/default
RUN rm -v /etc/nginx/sites-available/default

# Copy a configuration file from the current directory
ADD app.conf /etc/nginx/sites-available

RUN ln -sf /etc/nginx/sites-available/app.conf /etc/nginx/sites-enabled/app.conf

# Append "daemon off;" to the beginning of the configuration
RUN echo "daemon off;" >> /etc/nginx/nginx.conf

RUN ["mkdir", "/usr/share/nginx/html/app"]
ADD index.html /usr/share/nginx/html/app/

RUN ["mkdir", "/home/nodejstest/"]
ADD index.js /home/nodejstest

# Expose ports
EXPOSE 80

CMD nodejs /home/nodejstest/index.js

# Set the default command to execute
# when creating a new container
CMD service nginx start
