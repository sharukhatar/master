FROM python:3.7
LABEL maintainer="sharukh"
WORKDIR /usr/src/app
COPY subscriber-mqtt.py /usr/src/app
COPY requirements.txt /usr/src/app
RUN pip3 install -r requirements.txt
CMD ["python3", "subscriber-mqtt.py"]
