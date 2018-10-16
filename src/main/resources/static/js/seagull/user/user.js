
function uploadCertificate() {
	
    $.ajax({
        url:  $('#PageContext').val() + 'uploadImage',
        type: "POST",
        data: new FormData($("#upload-certificate-form")[0]),
        enctype: 'multipart/form-data',
        
        processData: false,
        contentType: false,
        cache: false,
        success: function(data) {
        	
        	
         	if(data)
        	{
         		console.log("certificate id: " + data)
        		$('#hinhCertificate').val( data.id);
         		$("#linkCertificate").attr("href", $('#PageContext').val() +'disk/' + data.name );		
         		
         		$("#linkCertificate").html(data.full_path);
        	}

        	
            // Handle upload success
            // ...
        },
        error: function() {
            // Handle upload error
            // ...
        }
    });
} // function uploadFile


var columnDefs_certificate = [{"title": "STT","targets": 0},
				  { 
					"targets": 1,
					"visible": false,
	                "searchable": false
				  },
				  {"title": "Account","targets": 2},
				  {"title": "Name","targets": 3},
				  {"title": "Poisition","targets": 4},
				  {"title": "phone","targets": 5},
				  {"title": "Active","targets": 6, 
				    	"render": function (data, type, row, meta) {
						    
		                	   return data==1 ? 'ACTIVE':'STOP';           
		                   }
				  },
				  {"title": "Avatar","targets": 7,
					  "mRender" : function ( data, type, full ) { 
						  
						 
						  return (full['hinh_avatar']==null ? '':"<a style='text-decoration: underline;color:blue' id='hinhScanLink' href='" + $('#PageContext').val() + 'disk/' + full['hinh_avatar'] + "' target='_blank' title='Download hình scan' >" + full['hinh_avatar']  + "</a>") ;
					     
					  }
				  
				  },
				  {
					  "title": "",
					  "targets": 8,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs User-edit" data-id=' + row['UserId'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 9,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs User-delete" data-id=' + row['UserId'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];

var aoColumns_certificate = [{ "mData": "stt","defaultContent":""},
				 { "mData": "UserId", "defaultContent":"" },
			     { "mData": "UserName", "defaultContent":"" },
			  	 { "mData": "fullName", "defaultContent":"" },
				 { "mData": "position", "defaultContent":"" },
				 { "mData": "phone", "defaultContent":"" },
				 { "mData": "IsActive", "defaultContent":"" },
				 { "mData": "hinh_avatar", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	
	
	
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	var page_context =  $('#PageContext').val() ;
	var url = $('#PageContext').val() + "user"  ;
    
	var nameTable_certificate = "xtable_certificate";
	
	var table = $('#' + nameTable_certificate).DataTable({
				//dom: "Blfrtip",
				//buttons: btnjs,
				"sAjaxSource": url,
				"sAjaxDataProp": "",
				//"order": [[ 0, "asc" ]],
			    "scrollCollapse": true,
			   // "scrollY": "150px",
			    "paging":         false,
			    "autoWidth": true,
			    "ordering": false,
                "scrollX":  true,
                "searching": false,
                "fnCreatedRow": function(row,data,index) {
                    $('td',row).eq(0).html(index + 1);
                },
                "columnDefs": columnDefs_certificate,
				"aoColumns": aoColumns_certificate
		 });
		table.columns.adjust().draw();
		
		
		var url = page_context + 'editUser/';
		initEventClickForEditOrDelete(nameTable_certificate,".User-edit",url);
		
		
		url = page_context + 'deleteUser/';
		initEventClickForEditOrDelete(nameTable_certificate,".User-delete",url);
		
	
	
		
});

