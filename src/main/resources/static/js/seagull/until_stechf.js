var btnjs = [{
		  extend: "copy",
		  className: "btn-sm"
		},
		{
		  extend: "csv",
		  className: "btn-sm"
		},
		{
		  extend: "excel",
		  className: "btn-sm"
		},
		{
		  extend: "pdfHtml5",
		  className: "btn-sm"
		},
		{
		  extend: "print",
		  className: "btn-sm"
		}];
function getFormData($form){
    var unindexed_array = $form.serializeArray();
    var indexed_array = {};

    $.map(unindexed_array, function(n, i){
        indexed_array[n['name']] = n['value'];
    });

    return indexed_array;
}
