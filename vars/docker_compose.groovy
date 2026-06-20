def call() {
    echo "Deploying using Docker Compose v2..."

    sh '''
        set -e

        docker compose version

        echo "Stopping containers..."
        docker compose down || true

        echo "Starting containers..."
        docker compose up -d --build

        docker ps
    '''
}
