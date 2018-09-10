var page_context;
function uploadFile() {
    $.ajax({
        url: page_context + 'uploadImage',
        type: "POST",
        data: new FormData($("#upload-file-form")[0]),
        enctype: 'multipart/form-data',
        
        processData: false,
        contentType: false,
        cache: false,
        success: function(data) {
        
        	if(data)
        	{
        		$('#hinh').val( data.id);
        		$("#avatar").attr("src", page_context +'disk/' + data.name );
        		
        	}
        	$("#upload-file-input").val('');
        	
            // Handle upload success
            // ...
        },
        error: function() {
            // Handle upload error
            // ...
        }
    });
} // function uploadFile


$(document).ready(function() {
    page_context = $('#PageContext').val();
    $("#upload-file-input").on("change", uploadFile);



});