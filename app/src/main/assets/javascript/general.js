const picDetailOverlayHtml = `<div class="picture-detail">
<img src="" width="100%" height="50%">
</div>`;
document.querySelector('body').insertAdjacentHTML('beforeend' , picDetailOverlayHtml);

var showingDetailPic = false;

document.querySelector('body').addEventListener('click', function(e) {

    if(showingDetailPic) {
        document.querySelector(".picture-detail").style.display = "none";
        showingDetailPic = false;
    }

    if (e.target && e.target.nodeName == "IMG") {

        if (!showingDetailPic) {
            document.querySelector(".picture-detail").style.display = "flex";
            document.querySelector(".picture-detail img").src = e.target.src;
            showingDetailPic = true;
        }

    }
});

/*
 adding the link to all topics to each page
 */
let fragment = document.createDocumentFragment()
let outerDiv = document.createElement('div')
let parentDiv = document.createElement('div')
let headingDiv = document.createElement('h4')
headingDiv.innerText = "Topics"
headingDiv.className = "center"
parentDiv.appendChild(headingDiv)

let topics = ['Basics of light', 'Intro to optical fiber', 'Fiber Optic Transmitter', 'Fiber Optic Receiver', 'Long Distances Optical Fiber'
               , 'Optical Fiber Networks', 'Optical Interconnection and Tools', 'References']

let index = 1;
topics.forEach(topic => {
    let aRef = document.createElement('a')
    aRef.innerText = topic
    if (index == 8) {
        aRef.href = "file:///android_asset/References.html"
    } else {
        aRef.href = 'file:///android_asset/topic_'.concat(index).concat('.html')
    }
    index += 1
    aRef.style.marginBottom = "1rem"
    parentDiv.appendChild(aRef)
});

parentDiv.className = "topics_container"
outerDiv.className = "outer_container"

outerDiv.appendChild(parentDiv)
fragment.appendChild(outerDiv)

document.querySelector('body').appendChild(fragment)





