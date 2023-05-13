var slides = document.getElementsByClassName('slide');
var currentSlide = 0;

function showSlide(n) {
  for (var i = 0; i < slides.length; i++) {
    slides[i].classList.remove('active');
  }
  
  slides[n].classList.add('active');
  currentSlide = n;
}

function nextSlide() {
  currentSlide++;
  if (currentSlide >= slides.length) {
    currentSlide = 0;
  }
  showSlide(currentSlide);
}

function prevSlide() {
  currentSlide--;
  if (currentSlide < 0) {
    currentSlide = slides.length - 1;
  }
  showSlide(currentSlide);
}

// Automatic slideshow
setInterval(nextSlide, 5000); // Change slide every 5 seconds