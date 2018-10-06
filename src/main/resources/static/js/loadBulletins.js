//Retrieves the data from back end in JSON format and binds the bulletins to the container
function loadBulletins(){
	$.ajax({
		url: "api/getBulletins?page="+pageSize++,
		type      : 'GET',
		dataType  : 'json',
		success: function(response){
			$.each(response.content, function(index,object){
				$('.container').append('<a class="post" target="_blank" href="'+object.bulletinSrcUrl+'">'
						+object.bulletinHeadLine+'</a><span class="postSpan">Source: </span><a class="postSourceUrl" target="_blank" href=http://'
						+object.publisherUrl+'>'+object.publisherName+'</a>');
			});
    	},
    	error: function(response){
    		$(".container").html("");
    		if(response==undefined){
    			$(".container").html("There are no articles to show, please try after sometime.");
    		}
    	}
	});
}