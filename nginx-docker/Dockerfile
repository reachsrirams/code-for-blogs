############################################################
# Dockerfile to build Nginx Installed Containers
# Based on Ubuntu
############################################################

# Set the base image to nginx
FROM nginx

# File Author / Maintainer
MAINTAINER Maintaner Sriram

RUN ["rm", "-f", "/etc/nginx/conf.d/default.conf"]

COPY app.conf /etc/nginx/conf.d/app.conf

RUN ["mkdir", "/usr/share/nginx/html/app"]

COPY index.html /usr/share/nginx/html/app/index.html
