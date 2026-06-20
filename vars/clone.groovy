def call(String url, String branch) {
    echo "Fetching source code from ${url} (branch: ${branch})"
    
    git url: url, branch: branch
}
