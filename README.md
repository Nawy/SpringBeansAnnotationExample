# SpringBeansAnnotationExample
This's project shows examples of AspectJ, Spring Bean Annotation and Java Based Configuration

Can you answer: "Why both person have the same address?" After all we created two address beans(addr1 and addr2) with various cities and countries.

In the end, we have the following result:
<pre>
Before address set method invoked!
Before address set method invoked!
Before address set method invoked!
Before address set method invoked!
Person: init()
Person: init()
print {
	print {
		Jennifer Aniston (Woman)
	}
	print {
		Address: Auckland, New Zealand
	}
	Balance: 2500000.00
}
print {
	print {
		Roger Moore (Man)
	}
	print {
		Address: Auckland, New Zealand
	}
	Balance: 350000.00
}
</pre>
