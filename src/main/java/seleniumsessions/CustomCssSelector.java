package seleniumsessions;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		//Css Selector
		
		//for id -- #id
		//htmlTag#id
		//aside#column-right
		
		//for class -- .class
		//htmlTag.class
		//aside.col-sm-3
		
		//Both class and id
		//htmlTag#id.class
		//or reverse
		//aside.col-sm-3#column-right
		
		//Multiple classes
		// .c1.c2.c3
		//aside.col-sm-3.hidden-xs
		
		//Multiple classes with #id
		// aside.col-sm-3.hidden-xs#column-right
		
		//other Attributes in CSS
		// tagName[attr='value'][attr2='value']  -- css
		// input[@attr='value' and @attr2='value'] -- xpath
		// [action='https://naveenautomationlabs.com/opencart/index.php?route=common/currency/currency'][id='form-currency'][method='post']
		// we have to use sq. bracket for diff. attributes
		
		//* is used for contains in CSS
		// form[action*='currency']
        // htmlTag[attr*='value']  -- css
		
		
		//^ is used for start's with in css
		// form[action^='https:/']
		// htmlTag[attr^='value']
		
		//$ is used for end's with in css
		// form[action$='currency']
		// htmlTag[attr$='value']
		
		// > for parent to child in css
		// space for going direct and indirect child
		// form[action$='currency'] div
		
		// > for going direct child in css
		// form[action$='currency'] > div
		
		//child to parent ---- NA
		//Backward traversing ---- NA
		//Preciding sibling ----- NA
		
		
		//folowing sibling
		// with + sign
		// div[class='container']+div
		
		//comma in CSS not available in xpath
		//for multiple elements 
		//  input#input-firstname,input#input-lastname,input[type='email']
		//  this can be use for mandatory field list
		
		// not in css
		// for excluding element
		// .form-control:not(#input-telephone)
		// .form-control:not([name='password'])
		
		                        //xpath            and               //CSS
		//syntax                 complex                             simple
		//Backward               yes                                  no
		//Text                   yes                                  no
		//Sibling                yes                                  limited
		//webtable               yes                                  limited
		//ptoc                   yes                                  yes
		//performance            good                                 good
	}

}
