def build(Map params){
    //sh "docker build -f Dockerfile -t andres37/homerpage:v1-${BUILD_ID} ." reemplaza la linea de abajo
    sh "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerContext}"
}

def push(Map params){
    sh "docker push ${params.DockerImage}"
}