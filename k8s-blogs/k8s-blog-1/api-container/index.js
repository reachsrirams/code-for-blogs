const http = require('http')
const os = require('os')
const port = 9090

const requestHandler = (request, response) => {
  console.log(request.url)
  var hostName = os.hostname();
  var prefix = "Hello from Node.js Server: ";
  var mesage = prefix + hostName;
  response.end(message)
}

const server = http.createServer(requestHandler)

server.listen(port, (err) => {
  if (err) {
    return console.log('something bad happened', err)
  }

  console.log(`server is listening on ${port}`)
})
