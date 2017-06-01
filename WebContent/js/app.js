(function($, document, window){
	
	$(document).ready(function(){

		$("[data-bg-color]").each(function(){
			var color = $(this).data("bg-color");
			$(this).css("background-color",color);
		});

		$("[data-bg-image]").each(function(){
			var image = $(this).data("bg-image");
			$(this).css("background-image","url("+image+")");
		});

		$(".create-account").on('click', function() {
			window.location = "app/index.html";
		})
	});

	$(window).load(function(){

	});

})(jQuery, document, window);