package us.roff.sandbox.hibernate.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import us.roff.sandbox.hibernate.domain.Value;
import us.roff.sandbox.hibernate.services.crud.ValueService;

@Component
public class ValueLoader implements ApplicationListener<ContextRefreshedEvent>{

	ValueService valueService;
	
	@Autowired
	public void setValueService(ValueService valueService) {
		this.valueService = valueService;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		load();
	}
	
	public void load() {
		Value value = new Value();
		value.setName("name1");
		value.setValue("value1");
		valueService.saveOrUpdate(value);
		
		value = new Value();
		value.setName("name2");
		value.setValue("value2");
		valueService.saveOrUpdate(value);
		
		value = new Value();
		value.setName("name3");
		value.setValue("value3");
		valueService.saveOrUpdate(value);
	}
}
