//initial page request size 0
var pageSize=0;

//Register the scroll and click functions to the DOM and loads initial content
$(function(){
	
	$("#articleName").val("");
	loadBulletins();
	
	$(window).scroll(function () { 
		   if ($(window).scrollTop() >= $(document).height() - $(window).height() - 10) {
			   loadBulletins();
		   }
		});
	
	//Retrieve the bulletin by name
	$("#searchArticleByName").click(function(){
		$.ajax({
			url: "api/getArticleByName?bulletinHeadLine="+$("#articleName").val(),
			type      : 'GET',
			dataType  : 'json',
			success: function(response){
				$(".container").html("");
				$.each(response, function(index,object){
					$('.container').append('<a class="post" target="_blank" href="'+object.bulletinSrcUrl+'">'
							+object.bulletinHeadLine+'</a><span class="postSpan">Source: </span><a class="postSourceUrl" target="_blank" href=http://'
							+object.publisherUrl+'>'+object.publisherName+'</a>');
				});
        	},
        	error: function(response){
        		$(".container").html("");
        		if(response==undefined){
        			$(".container").html("Ouch! There are no articles for the searched name.");
        		}
        	}
		});
	});
	
});

