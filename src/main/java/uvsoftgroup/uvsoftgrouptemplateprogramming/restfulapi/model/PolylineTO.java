package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model;

import java.util.ArrayList;

public class PolylineTO {
	  
	  private final ArrayList<PointTO> points;

	  private PolylineTO(ArrayList<PointTO> points) {
	    this.points = points;
	  }

	  public static PolylineTO create() {
	    return new PolylineTO(new ArrayList<PointTO>());
	  }

	  public PolylineTO add(PointTO point) {
	    ArrayList<PointTO> newPoints = new ArrayList<>(this.points);
	    newPoints.add(point);
	    return new PolylineTO(newPoints);
	  }

	  public int size() {
	    return points.size();
	  }

	  public PointTO getPoint(int index) {
	    return points.get(index);
	  }
	  
	
	  
}
