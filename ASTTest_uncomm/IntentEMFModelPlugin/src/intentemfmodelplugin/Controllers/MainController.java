package intentemfmodelplugin.Controllers;

import androidintentsdsl.AndroidintentsdslFactory;
import androidintentsdsl.Extra;
import androidintentsdsl.Intent;
import androidintentsdsl.IntentsCollection;
import androidintentsdsl.impl.AndroidintentsdslPackageImpl;

public class MainController {

	public MainController() {
		AndroidintentsdslPackageImpl.init();
		AndroidintentsdslFactory factory = AndroidintentsdslFactory.eINSTANCE;
		
		Intent intent =factory.createIntent();
		
		Extra e = null;
		
		intent.getAvailableExtras().add(e);
	}
}
