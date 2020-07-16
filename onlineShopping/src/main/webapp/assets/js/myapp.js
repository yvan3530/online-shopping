$(function(){

	
	switch(menu){
	case'About us':
		$('#about').addClass('active');
		break;
	case'Contact us':
		$('#contact').addClass('active');
		break;
		default:
		case'All products':
			$('#listProducts').addClass('active');
			break;
			$('#listProducts').addClass('active');
			$('#a_'+menu).addClass('active');
			break;
	}
});
