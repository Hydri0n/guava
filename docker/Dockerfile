FROM java:8
RUN mkdir -p /usr/local/guava
ADD guava-0.0.1.jar /usr/local/guava/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
