subtotal = 0

while True:
    name = input("\nEnter product name: ")

    price = float(input("Enter price: "))
    quantity = int(input("Enter quantity: "))

    total = price * quantity
    subtotal += total

    print(f"item(s): {name} \nTotal: ${total:.2f}")

    choice = input("Add another item? (yes/no): ")

    if choice.lower() == "no":
        break

# These lines should be OUTSIDE the loop
discount = float(input("\nEnter discount amount: "))

vat = 0.075 * subtotal
final_total = subtotal + vat - discount

print("\n    RECEIPT   ")
print(f"Subtotal: ${subtotal:.2f}")
print(f"Discount: ${discount:.2f}")
print(f"VAT (7.5%): {vat:.2f}")
print(f"Total to pay: ${final_total:.2f}")
