var video;
window.onload = function () {

    //add constraints object
    var constraints = { audio: true,
                        video: true};

    //call getUserMedia,
    navigator.mediaDevices.getUserMedia(constraints).then(function(mediaStream){
        video = document.getElementById('webcam');
        video.srcObject = mediaStream;
       video.play();
        
    }).catch(function(err){
        console.log("err!" + err.message);
    });

   
}
var canvas, ctx;
function abc() {
    video.src = "";
}
function snapshot() {
    video.play();
   // Draws current image from the video element into the canvas
   canvas = document.getElementById("myCanvas");
   ctx = canvas.getContext('2d');
    ctx.drawImage(video, 0, 0, canvas.width, canvas.height);
    // video.pause();
}