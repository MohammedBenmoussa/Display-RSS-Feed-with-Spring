package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import util.RSSUtil;

@Controller
@RequestMapping("rss")
public class RSSController {
	

		@RequestMapping(method=RequestMethod.GET)
		public String index(ModelMap mp)
		{
			//https://www.lemonde.fr/actualite-medias/article/2019/08/12/les-flux-rss-du-monde-fr_5498778_3236.html
			//http://feeds.reuters.com/news/artsculture?format=xml
			String lien="https://rmcsport.bfmtv.com/rss/info/flux-rss/flux-toutes-les-actualites/";
			mp.put("items",RSSUtil.elements(lien));
			
			return "index";
		}
	
}
