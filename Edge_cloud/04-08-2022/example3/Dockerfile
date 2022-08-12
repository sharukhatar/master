FROM python:3.10.6-alpine3.16
LABEL maintainer = "SharukhAtar"
WORKDIR /usr/src/pythoncodes

COPY read_file.py /usr/src/pythoncodes
COPY demofile.txt /usr/src/pythoncodes
CMD ["python3","read_file.py"]

# docker build -t readfile:v3 .
# docker run -it readfile:v0
# sudo docker run --name addcal -it readfile:v3