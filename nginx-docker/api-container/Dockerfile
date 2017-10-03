############################################################
# Dockerfile to build Nginx Installed Containers
# Based on Ubuntu
############################################################

# Set the base image to Ubuntu
FROM ubuntu

# File Author / Maintainer
MAINTAINER Maintaner Name

# Update the repository
RUN apt-get update

# Install necessary tools
RUN apt-get install -y nano wget dialog net-tools

# Download and Install NodeJS
RUN apt-get install -y nodejs  

# Create directory for storing NodeJS or API code and copy sample index.js
RUN ["mkdir", "/home/nodejstest/"]
ADD index.js /home/nodejstest

# Expose ports
EXPOSE 9090

# Start NodeJS with sample program
CMD ["nodejs", "/home/nodejstest/index.js"]

