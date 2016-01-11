package model.dao;

	import java.util.List;

	import com.avaje.ebean.Ebean;

	public class BaseDAO<T> {
		
		private Class<T> _classType;
		
		public BaseDAO(Class<T> classType) {
			_classType = classType;
		}
		
		public void create(Object beanObject) throws Exception {
				Ebean.save(beanObject);
		}

		public List<T> selectAll() throws Exception {
				return Ebean.find(_classType).findList();
		}
		
		public void update(Object beanObject) throws Exception {
				Ebean.update(beanObject);
		}
		
		public void delete(Object beanObject) throws Exception {
				Ebean.delete(beanObject);
		}
	}
	
	
