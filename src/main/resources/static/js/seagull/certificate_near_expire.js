	$('#cusloading').show();
$(document).ready( function () {




	initTable("div_tb_ListOfCrew","tb_ListOfCrew");


	var page_context =  $('#PageContext').val() ;
    var url = $('#PageContext').val() + "certificate_near_expire"   ;




    var title = ["No.","CREW","NAME OF CERTIFICATE","NUMBER","ISSUED DATE","EXPIRES DATE"];
	var table = $('#tb_ListOfCrew').DataTable({
				"sAjaxSource": url,
				"sAjaxDataProp": "",
				//"order": [[ 0, "asc" ]],
			    "scrollCollapse": true,
			    "paging":         false,
			    "autoWidth": false,
			    "ordering": false,

                "scrollX":  true,
			    fixedColumns: true,

                "fnCreatedRow": function(row,data,index) {
                    $('td',row).eq(0).html(index + 1);
                },
                "columnDefs": [
                {
                    "targets": 0,
                    "width": "2%"

                } ,
                {
                    "targets": 1,
                    "width": "20%",
                    "render": function (data, type, row, meta) {
                        return '<a  href="' + page_context + 'InfoCrew/' + row['thuyenvienID'] +  '"><strong>' + row['hoten'] + '</strong></a>';
                    }


                } ,
                {
                    "targets": 2,
                    "width": "20%"


                } ,
                {
                    "targets": 3,
                    "width": "10%"

                } ,
                {
                    "targets": 4,
                    "data": "tungay",
	                "render": function (data) {
	                	if(isNaN(data))
	                	{
	                		return '';
	                	}
	                	else
	                		return formatDate(data);
	                }

                } ,

                {
                	"targets": 5,
                	"data": "denngay",
	                "render": function (data) {
	                	if(isNaN(data))
	                	{
	                		return '';
	                	}
	                	else
	                		return formatDate(data);
	                }
                }


                ],
				"aoColumns": [
					 { "mData": null},
				     { "mData":"thuyenvienID", "defaultContent":"" },
				     { "mData": "text", "defaultContent":"" },
			      	 { "mData": "so", "defaultContent":"" },
					 { "mData": "tungay", "defaultContent":"" },
					 { "mData": "denngay", "defaultContent":"" }
				]
		 });


		  for (var i=0;i<title.length;i++) {
			  console.log(i);
              table.columns(i).header().to$().text(title[i])
          }
          table.columns.adjust().draw();




});
$('#cusloading').hide();
