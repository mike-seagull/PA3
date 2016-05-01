/*!
 * Clean Blog v1.0.0 (http://startbootstrap.com)
 * Copyright 2014 Start Bootstrap
 * Licensed under Apache 2.0 (https://github.com/IronSummitMedia/startbootstrap/blob/gh-pages/LICENSE)
 */

// Navigation Scripts to Show Header on Scroll-Up
jQuery(document).ready(function($) {
    var MQL = 1170;

    //primary navigation slide-in effect
    if ($(window).width() > MQL) {
        var headerHeight = $('.navbar-custom').height();
        $(window).on('scroll', {
                previousTop: 0
            },
            function() {
                var currentTop = $(window).scrollTop();
                //check if user is scrolling up
                if (currentTop < this.previousTop) {
                    //if scrolling up...
                    if (currentTop > 0 && $('.navbar-custom').hasClass('is-fixed')) {
                        $('.navbar-custom').addClass('is-visible');
                    } else {
                        $('.navbar-custom').removeClass('is-visible is-fixed');
                    }
                } else {
                    //if scrolling down...
                    $('.navbar-custom').removeClass('is-visible');
                    if (currentTop > headerHeight && !$('.navbar-custom').hasClass('is-fixed')) $('.navbar-custom').addClass('is-fixed');
                }
                this.previousTop = currentTop;
            });
    }
});
function makeReviewHTML(source, playName, reviewName, date, genre, review) {
	var review =	'<div class="post-preview">' +
						'<h2 class="post-title">' +reviewName+'</h2>' +
						'<h3 class="post-subtitle">'+review+'</h3>' +
						'<p class="post-meta">Source: <a href="#">'+source+'</a> on <a href="#">'+date+'</a></p>' +
						'<p class="post-meta"><a href="#">'+genre+'</a> > <a href="#">'+playName+'</a></p>'
					'</div>' +
					'<hr>';
	return review;
}
function getFeaturedReviews() {
	var random_number = Math.floor((Math.random() * 10)); //random number between 0 and 9
	//get all reviews
	//select 5 random from the list
	//make them into html
	//append them into the html project
	
}
