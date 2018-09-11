$(document).ready( function () {
	
	
	var page_context =  $('#PageContext').val() ;

	var url = $('#PageContext').val() + "thongtingiadinh/" + 8   ;

    //var title = ["","Họ tên","Quan hệ","Nghề nghiệp","Điện thoại","Địa chỉ","Ghi chú"];
    
	var table = $('#xtable').DataTable({
				dom: "Blfrtip",
				buttons: btnjs,
				"sAjaxSource": url,
				"sAjaxDataProp": "",
				//"order": [[ 0, "asc" ]],
			    "scrollCollapse": true,
			    "paging":         false,
			    "autoWidth": true,
			    "ordering": false,
			
                "scrollX":  true,
			    fixedColumns: true,
			    
                "fnCreatedRow": function(row,data,index) {
                    $('td',row).eq(0).html(index + 1);
                },
                "columnDefs": [ 
                {
                	"title": "#",
                    "targets": 0
                   
                } ,
                {
                	"title": "Họ tên",
                    "targets": 1
                } ,
                {
                	"title": "Quan hệ",
                    "targets": 2
                    
                   
                } ,
                {
                	"title": "Nghề nghiệp",
                    "targets": 3
                   
                } ,
                {
                	"title": "Điện thoại",
                    "targets": 4
                   
                } ,
          
                {
                	"title": "Địa chỉ",
                	"targets": 5
                } ,
                {
                	"title": "Ghi Chú",
                	"targets": 6
                } ,
                
                ],
				"aoColumns": [
					 { "mData": null},
				     { "mData": "hoten", "defaultContent":"" },
			      	 { "mData": "quanhe", "defaultContent":"" },
					 { "mData": "nghenghiep", "defaultContent":"" },
					 { "mData": "dienthoai", "defaultContent":"" },
					 { "mData": "diachi", "defaultContent":"" },
					 { "mData": "ghichu", "defaultContent":"" }
				]
		 });
		 
		 
		  $('#xtable tbody').on( 'click', 'button', function () {
		        var data = table.row( $(this).parents('tr') ).data();
		        console.log(data);
		        alert( data[3] +"'s salary is: "+ data[ 5 ] );
		    } );
		  
		 // table.fnAdjustColumnSizing();
		  
		  
		  
//		  for (var i=0;i<title.length;i++) {
//              table.columns(i).header().to$().text(title[i])
//          }
          table.columns.adjust().draw();
		 
});

