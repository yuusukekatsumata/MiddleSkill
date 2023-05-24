const zoom = document.querySelectorAll(".zoom");
const zoomback = document.getElementById("zoomback");
const zoomimg = document.getElementById("zoomimg");

// 一括でイベントリスナ
zoom.forEach(function(value) {
      value.addEventListener("click",kakudai);
      });

function kakudai(e) {

// 拡大領域を表
zoomback.style.display = "flex";
// 押された画像のリンクを渡す
zoomimg.setAttribute("src",e.target.getAttribute("src"));
}

// 元に戻すイベントリスナを指定
zoomback.addEventListener("click",modosu);

// 拡大領域を無きものに
function modosu() {

zoomback.style.display = "none";
}

$('.slider').slick({
  autoplay: true,       //自動再生
  autoplaySpeed: 2000,  //自動再生のスピード
  speed: 800,           //スライドするスピード
  dots: true,           //スライド下のドット
  arrows: true,         //左右の矢印
  infinite: true,       //永久にループさせる
});
