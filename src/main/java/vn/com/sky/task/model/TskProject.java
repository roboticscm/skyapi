package vn.com.sky.task.model;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import vn.com.sky.base.SortableEntity;

@EqualsAndHashCode(callSuper = false)
@Data
@Table
public class TskProject extends SortableEntity {
	private String name;
	private String description;

}
